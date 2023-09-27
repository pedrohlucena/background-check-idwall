package co.idwall.model;

public class GetWantedsParameters {
	private String full_name;
    private String exact_match;
    private String birthdate;
    private String characteristics;
    private String nationality;
    private String spoken_language;
    private String image_url;

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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
