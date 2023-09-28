package co.idwall.utils;

import java.util.List;
import java.util.Map;

import co.idwall.exceptions.BadQueryParametersError;
import co.idwall.exceptions.ExactMatchPassedWithFullNameError;
import co.idwall.model.GetWantedsParameters;

public class SchemaValidator {
	public GetWantedsParameters validate(Map<String, String> body) throws BadQueryParametersError {
		GetWantedsParameters parameters = new GetWantedsParameters();
		
		List<String> allowedQueryParams = ObjectUtils.getObjectKeys(parameters);
		
		if (
				(body.get("exact_match") != null && body.get("full_name") == null)
		) {
			throw new ExactMatchPassedWithFullNameError();
		}
		
		body.forEach((key, value) -> {
			boolean paramIsValid = allowedQueryParams.contains(key);

			if(!paramIsValid) {
				 throw new BadQueryParametersError();
			};
			
			if(paramIsValid) {
				if (key == "full_name") parameters.setBirth_date(value);
				if (key == "characteristics") parameters.setCharacteristics(value);
				if (key == "birth_date") parameters.setBirth_date(value);
				if (key == "characteristics") parameters.setCharacteristics(value);
				if (key == "nationality") parameters.setNationality(value);
				if (key == "spoken_language") parameters.setSpoken_language(value);
			};
		});
		
		return parameters;
	}
}
