package co.idwall.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.idwall.model.GetWantedsParameters;
import co.idwall.model.Wanted;
import co.idwall.repository.WantedRepository;
import co.idwall.responses.GetWantedsResponse;

@Service
public class GetWantedBusiness {
	@Autowired
    private WantedRepository repository;
    
	private GetWantedsParameters parameters;
	
	public GetWantedBusiness() {}
	
//		private getEventAccordingToParameters() {
//        this.parameters = parameters;
//    }
//	
	public GetWantedsResponse getWanteds() {
		List<Wanted> wanteds = repository.findAll();
		return new GetWantedsResponse(wanteds);
		
//		etEventAccordingToParameters();
    }

	public void setParameters(GetWantedsParameters parameters) {
		this.parameters = parameters;
	}
}
