package co.idwall.resources;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Wanted> getWanteds(@RequestParam Map<String,String> queryParameters) {
		try {
			SchemaValidator validator = new SchemaValidator();
			GetWantedsParameters parameters = validator.validate();
			GetWantedBusiness business = new GetWantedBusiness(parameters);
			
	        return wantedRepository.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
	
//	@GetMapping
//    public List<Ingredient> getAllIngredients() {
//        return ingredientRepository.findAll();
//    }
}
