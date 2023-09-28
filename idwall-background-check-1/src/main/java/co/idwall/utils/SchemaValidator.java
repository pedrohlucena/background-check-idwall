package co.idwall.utils;

import java.util.List;
import java.util.Map;

import co.idwall.model.GetWantedsParameters;

public class SchemaValidator {
	public GetWantedsParameters validate(Map<String, String> body) {
		GetWantedsParameters parameters = new GetWantedsParameters();
		
		List<String> allowedQueryParams = ObjectUtils.getObjectKeys(parameters);
		
		body.forEach((key, value) -> {
			boolean paramIsValid = allowedQueryParams.contains(key);
			
			if(!paramIsValid) throw new Error();
			
			if(paramIsValid) {
				if (key == "full_name") parameters.setFull_name(value);
				if (key == "exact_match") parameters.setExact_match(value);
				if (key == "birthdate") parameters.setBirthdate(value);
				if (key == "characteristics") parameters.setCharacteristics(value);
				if (key == "nationality") parameters.setNationality(value);
				if (key == "spoken_language") parameters.setSpoken_language(value);
				if (key == "image_url") parameters.setImage_url(value);
			};
		});
		
		return parameters;
	}
}
