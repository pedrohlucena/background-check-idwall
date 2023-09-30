package co.idwall.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "FBI_INTERPOL_WANTED_CRIMINALS")
public class Wanted {
	@Id
	private String ncic;
	
    @Lob
    private String charges;
    
    
    @Lob
    private String nationality;
    
    @Lob
    private String dates_of_birth_used;
    
    @Lob
    private String distinguishing_marks;
    
    @Lob
    private String eyes_color;
    
    @Lob
    private String forename;
    
    @Lob
    private String hair_color;
    
    @Lob
    private String height;
    
    @Lob
    private String images;
    
    @Lob
    private String issuing_country_id;
    
    @Lob
    private String languages;
    
    @Lob
    private String name;
    
    @Lob
    private String place_of_birth;
    
    @Lob
    private String sex;
    
    @Lob
    private String weight;
    
    @Lob
    private String wanted_origin;
    
    @Lob
    private String age_range;
    
    @Lob
    private String aliases;
    
    @Lob
    private String wanted_origin_id;
    
    @Lob
    private String age_max;
    
    @Lob
    private String age_min;
    
    @Lob
    private String build;
    
    @Lob
    private String complexion;
    
    @Lob
    private String details;
    
    @Lob
    private String eyes_raw;
    
    @Lob
    private String field_offices;
    
    @Lob
    private String hair_raw;
    
    @Lob
    private String height_max;
    
    @Lob
    private String height_min;
    
    @Lob
    private String modified;

    
    @Lob
    private String occupations;
    
    @Lob
    private String person_classification;
    
    @Lob
    private String possible_countries;
    
    @Lob
    private String possible_states;
    
    @Lob
    private String poster_classification;
    
    @Lob
    private String publication;
    
    @Lob
    private String race;
    
    @Lob
    private String race_raw;
    
    @Lob
    private String remarks;
    
    @Lob
    private String reward_text;
    
    @Lob
    private String status;
    
    @Lob
    private String subjects;
    
    @Lob
    private String suspects;
    
    @Lob
    private String title;
    
    @Lob
    private String url;
    
    @Lob
    private String warning_message;
    
    @Lob
    private String weight_max;
    
    @Lob
    private String weight_min;
    
    @Lob
    private String analyzed_at;

	public String getNcic() {
		return ncic;
	}

	public void setNcic(String ncic) {
		this.ncic = ncic;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDates_of_birth_used() {
		return dates_of_birth_used;
	}

	public void setDates_of_birth_used(String dates_of_birth_used) {
		this.dates_of_birth_used = dates_of_birth_used;
	}

	public String getDistinguishing_marks() {
		return distinguishing_marks;
	}

	public void setDistinguishing_marks(String distinguishing_marks) {
		this.distinguishing_marks = distinguishing_marks;
	}

	public String getEyes_color() {
		return eyes_color;
	}

	public void setEyes_color(String eyes_color) {
		this.eyes_color = eyes_color;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getIssuing_country_id() {
		return issuing_country_id;
	}

	public void setIssuing_country_id(String issuing_country_id) {
		this.issuing_country_id = issuing_country_id;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace_of_birth() {
		return place_of_birth;
	}

	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWanted_origin() {
		return wanted_origin;
	}

	public void setWanted_origin(String wanted_origin) {
		this.wanted_origin = wanted_origin;
	}

	public String getAge_range() {
		return age_range;
	}

	public void setAge_range(String age_range) {
		this.age_range = age_range;
	}

	public String getAliases() {
		return aliases;
	}

	public void setAliases(String aliases) {
		this.aliases = aliases;
	}

	public String getWanted_origin_id() {
		return wanted_origin_id;
	}

	public void setWanted_origin_id(String wanted_origin_id) {
		this.wanted_origin_id = wanted_origin_id;
	}

	public String getAge_max() {
		return age_max;
	}

	public void setAge_max(String age_max) {
		this.age_max = age_max;
	}

	public String getAge_min() {
		return age_min;
	}

	public void setAge_min(String age_min) {
		this.age_min = age_min;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getEyes_raw() {
		return eyes_raw;
	}

	public void setEyes_raw(String eyes_raw) {
		this.eyes_raw = eyes_raw;
	}

	public String getField_offices() {
		return field_offices;
	}

	public void setField_offices(String field_offices) {
		this.field_offices = field_offices;
	}

	public String getHair_raw() {
		return hair_raw;
	}

	public void setHair_raw(String hair_raw) {
		this.hair_raw = hair_raw;
	}

	public String getHeight_max() {
		return height_max;
	}

	public void setHeight_max(String height_max) {
		this.height_max = height_max;
	}

	public String getHeight_min() {
		return height_min;
	}

	public void setHeight_min(String height_min) {
		this.height_min = height_min;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getOccupations() {
		return occupations;
	}

	public void setOccupations(String occupations) {
		this.occupations = occupations;
	}

	public String getPerson_classification() {
		return person_classification;
	}

	public void setPerson_classification(String person_classification) {
		this.person_classification = person_classification;
	}

	public String getPossible_countries() {
		return possible_countries;
	}

	public void setPossible_countries(String possible_countries) {
		this.possible_countries = possible_countries;
	}

	public String getPossible_states() {
		return possible_states;
	}

	public void setPossible_states(String possible_states) {
		this.possible_states = possible_states;
	}

	public String getPoster_classification() {
		return poster_classification;
	}

	public void setPoster_classification(String poster_classification) {
		this.poster_classification = poster_classification;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getRace_raw() {
		return race_raw;
	}

	public void setRace_raw(String race_raw) {
		this.race_raw = race_raw;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReward_text() {
		return reward_text;
	}

	public void setReward_text(String reward_text) {
		this.reward_text = reward_text;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getSuspects() {
		return suspects;
	}

	public void setSuspects(String suspects) {
		this.suspects = suspects;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWarning_message() {
		return warning_message;
	}

	public void setWarning_message(String warning_message) {
		this.warning_message = warning_message;
	}

	public String getWeight_max() {
		return weight_max;
	}

	public void setWeight_max(String weight_max) {
		this.weight_max = weight_max;
	}

	public String getWeight_min() {
		return weight_min;
	}

	public void setWeight_min(String weight_min) {
		this.weight_min = weight_min;
	}

	public String getAnalyzed_at() {
		return analyzed_at;
	}

	public void setAnalyzed_at(String analyzed_at) {
		this.analyzed_at = analyzed_at;
	}
}