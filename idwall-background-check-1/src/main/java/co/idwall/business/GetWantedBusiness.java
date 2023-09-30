package co.idwall.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.idwall.model.GetWantedsParameters;
import co.idwall.model.Wanted;
import co.idwall.repository.WantedRepository;
import co.idwall.responses.GetWantedsResponse;
import co.idwall.utils.ClassUtils;
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
//		System.out.println(parameters.getWantedOriginId());
		
		boolean hasQueryParameters = ObjectUtils
				.getKeys(parameters).size() != 0;
		
//		System.out.println(ObjectUtils
//				.getKeys(parameters).size());
		
		if(!hasQueryParameters) return repository.findAll();
		
//		if(parameters.getWantedOriginId() != null) {
//			return new List(repository.findById());
//		}
		
		return List.of();
	}

	public void setParameters(GetWantedsParameters parameters) {
		this.parameters = parameters;
	}
}
