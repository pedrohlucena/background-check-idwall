package co.idwall.errors;

import co.idwall.responses.ErrorResponse;

public class ErrorResponses {    
    public static ErrorResponse getProblemsCallingAPIResponse() {
    	return new ErrorResponse(
			"0001", 
			"Problems calling API"
		);
    }
    
    public static ErrorResponse getBadQueryParametersResponse() {
    	return new ErrorResponse(
			"0002", 
			"Unexpected query parameter"
		);
    }

    public static ErrorResponse getExactMatchPassedWithFullNameResponse() {
    	return new ErrorResponse(
			"0003", 
			"If exact_match is passed, full_name must exists"
		);
    }
}
