package co.idwall.model;

public class GetWantedsParameters {
	private String wanted_origin_id;
	private String alias;
    private String exact_match;
    private String birth_date;
    private String distinguishing_marks;
    private String nationality;
    private String languages;
    private String sex;
    private String wanted_in;
    private String charges;
    
	public String getWanted_origin_id() {
		return wanted_origin_id;
	}
	
	public void setWanted_origin_id(String wanted_origin_id) {
		this.wanted_origin_id = wanted_origin_id;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getExact_match() {
		return exact_match;
	}
	
	public void setExact_match(String exact_match) {
		this.exact_match = exact_match;
	}
	
	public String getBirth_date() {
		return birth_date;
	}
	
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	
	public String getDistinguishing_marks() {
		return distinguishing_marks;
	}
	
	public void setDistinguishing_marks(String distinguishing_marks) {
		this.distinguishing_marks = distinguishing_marks;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getLanguages() {
		return languages;
	}
	
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getWanted_in() {
		return wanted_in;
	}
	
	public void setWanted_in(String wanted_in) {
		this.wanted_in = wanted_in;
	}
	
	public String getCharges() {
		return charges;
	}
	
	public void setCharges(String charges) {
		this.charges = charges;
	}    
}
