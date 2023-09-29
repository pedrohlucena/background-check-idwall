package co.idwall.utils;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import co.idwall.exceptions.BadQueryParametersError;
import co.idwall.exceptions.ExactMatchPassedWithFullNameError;
import co.idwall.exceptions.InvalidBirthDateFormatError;
import co.idwall.model.GetWantedsParameters;
import co.idwall.regexs.Regexs;

public class SchemaValidator {
	public void validateExactMatch(Map<String, String> body) {
		if (
			(body.get("exact_match") != null && body.get("alias") == null)
		) {
			throw new ExactMatchPassedWithFullNameError();
		}
	}
	
	public void validateBirthDate(Map<String, String> body) {
		String birthDate = body.get("birth_date");
		
		if (birthDate == null) return;

        Pattern regex = Regexs.MONTH_DAY_YEAR_DATE.getPattern();

        Matcher regexMatcher = regex.matcher(birthDate);
        
        if (!regexMatcher.find()) {
            throw new InvalidBirthDateFormatError();
        }
	}
	
	public GetWantedsParameters validateOtherParameters(Map<String, String> body) {
		GetWantedsParameters parameters = new GetWantedsParameters();
		
		List<String> allowedQueryParams = ObjectUtils.getObjectKeys(parameters);
		
		body.forEach((key, value) -> {
			boolean paramIsValid = allowedQueryParams.contains(key);

			if(!paramIsValid) throw new BadQueryParametersError();
			
			if(paramIsValid) {
				if (key == "wanted_origin_id") parameters.setWanted_origin_id(value);
				if (key == "alias") parameters.setAlias(value);
				if (key == "exact_match") parameters.setExact_match(value);
				if (key == "birth_date") parameters.setBirth_date(value);
				if (key == "distinguishing_marks") parameters.setDistinguishing_marks(value);
				if (key == "nationality") parameters.setNationality(value);
				if (key == "languages") parameters.setLanguages(value);
				if (key == "sex") parameters.setSex(value);
				if (key == "wanted_in") parameters.setWanted_in(value);
				if (key == "charges") parameters.setCharges(value);
			};
		});
		
		return parameters;
	}
	
	public GetWantedsParameters validate(Map<String, String> body) {	
		validateExactMatch(body);
		validateBirthDate(body);
		
		GetWantedsParameters parameters = validateOtherParameters(body);
		
		return parameters;
	}
}
