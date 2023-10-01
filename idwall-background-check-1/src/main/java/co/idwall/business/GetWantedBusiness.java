package co.idwall.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.idwall.exceptions.WantedNotFound;
import co.idwall.model.GetWantedsParameters;
import co.idwall.model.Wanted;
import co.idwall.model.WantedSearchCriteria;
import co.idwall.repository.WantedRepository;
import co.idwall.responses.GetWantedsResponse;
import co.idwall.specifications.WantedSpecification;
import co.idwall.utils.ObjectUtils;

@Service
public class GetWantedBusiness {
	@Autowired
    private WantedRepository repository;
    
	private GetWantedsParameters parameters;
	
	public GetWantedBusiness() {}
		
	public GetWantedsResponse getWanteds() {
		List<Wanted> wanteds = getWantedsAccordingToParameters();
		return new GetWantedsResponse(wanteds);
    }
	
	private List<Wanted> getWantedsAccordingToParameters() {		
		boolean hasQueryParameters = !ObjectUtils
				.getKeys(parameters).isEmpty();
			
		if(!hasQueryParameters) return repository.findAll();
		
		String wantedOriginIdParam = parameters.getWantedOriginId();
		
		if(wantedOriginIdParam != null) {
			Optional<Wanted> wanted = repository.findById(wantedOriginIdParam);	
			
			if(!wanted.isPresent()) throw new WantedNotFound();
			
			return List.of(wanted.get());
		}
		
		WantedSearchCriteria searchCriteria = new WantedSearchCriteria();
		
		String aliasParam = parameters.getAlias();
		
		if(aliasParam != null) {
			searchCriteria.setAliases(aliasParam);
		}
		
		return repository.findAll(new WantedSpecification(searchCriteria));
	}

	public void setParameters(GetWantedsParameters parameters) {
		this.parameters = parameters;
	}
}
