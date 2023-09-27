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
@Table(name = "wanteds")
//@SequenceGenerator(name = "ingredient", sequenceName = "RECIPE_SQ", allocationSize = 1)
public class Wanted {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_sequence_generator")
	@SequenceGenerator(name = "your_sequence_generator", sequenceName = "your_sequence_name", allocationSize = 1)
	private Long id;
	
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
    private String ncic;
    
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
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient")
//    private int id;
//    @NotBlank(message = "A name must be defined for the resource")
//    @Size(max = 50)
//    private String name;
//    @Min(value=0, message = "The amount of carbohidrates may not be negative")
//    private double carbohidrate;
//
//    @Min(value=0, message = "The amount of fat may not be negative")
//    private double fat;
//
//    @Min(value=0, message = "The amount of protein may not be negative")
//    private double protein;
//
//    private boolean alcohol_free;
//
//    private boolean egg_lact_vegetarian;
//
//    private boolean vegan;
//
//    private boolean gluten_free;
//
//    private boolean lactose_free;
//
//    @JsonIgnoreProperties("ingredients")
//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {CascadeType.ALL},
//            mappedBy = "ingredients")
//    private List<Recipe> recipes;
}