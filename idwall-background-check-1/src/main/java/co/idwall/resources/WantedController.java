package co.idwall.resources;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.idwall.business.GetWantedBusiness;
import co.idwall.errors.ErrorResponses;
import co.idwall.exceptions.BadQueryParametersError;
import co.idwall.exceptions.ExactMatchPassedWithFullNameError;
import co.idwall.model.GetWantedsParameters;
import co.idwall.model.Wanted;
import co.idwall.repository.WantedRepository;
import co.idwall.responses.ErrorResponse;
import co.idwall.utils.SchemaValidator;

@RestController
@RequestMapping("wanteds")
public class WantedController {
    @Autowired
    private WantedRepository wantedRepository;
	
//    produces = "application/json"
	@GetMapping(produces = "application/json")
    public ResponseEntity<?> getWanteds(@RequestParam Map<String,String> queryParameters) {
		try {
			SchemaValidator validator = new SchemaValidator();
			GetWantedsParameters parameters = validator.validate(queryParameters);
			GetWantedBusiness business = new GetWantedBusiness(parameters);

			return ResponseEntity
					.status(HttpStatus.OK)
					.body(
							wantedRepository.findAll()
					);
		} catch (ExactMatchPassedWithFullNameError e) {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body(ErrorResponses.getExactMatchPassedWithFullNameResponse());
		} catch (BadQueryParametersError e) {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body(ErrorResponses.getBadQueryParametersResponse());
		} catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(ErrorResponses.getProblemsCallingAPIResponse());
		}
    }
}
