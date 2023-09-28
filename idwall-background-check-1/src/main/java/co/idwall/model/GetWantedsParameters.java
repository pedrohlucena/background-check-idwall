package co.idwall.model;

public class GetWantedsParameters {
	private String full_name;
    private String exact_match;
    private String birth_date;
    private String characteristics;
    private String nationality;
    private String spoken_language;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
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

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSpoken_language() {
        return spoken_language;
    }

    public void setSpoken_language(String spoken_language) {
        this.spoken_language = spoken_language;
    }
}
