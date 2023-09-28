package co.idwall.resources;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.idwall.business.GetWantedBusiness;
import co.idwall.model.GetWantedsParameters;
import co.idwall.model.Wanted;
import co.idwall.repository.WantedRepository;
import co.idwall.utils.SchemaValidator;

@RestController
@RequestMapping("wanteds")
public class WantedController {
    @Autowired
    private WantedRepository wantedRepository;
	
	@GetMapping("/")
    public ResponseEntity<?> getWanteds(@RequestParam Map<String,String> queryParameters) {
		try {
			SchemaValidator validator = new SchemaValidator();
			GetWantedsParameters parameters = validator.validate(queryParameters);
			System.out.println(parameters.toString());
			GetWantedBusiness business = new GetWantedBusiness(parameters);
			
			Wanted[] wanteds = wantedRepository.findAll();
			
			return ResponseEntity.ok(
					wantedRepository.findAll()
			);
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
    }
}
