package org.jesuitasrioja.ad1HB.persistencia;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "country")
public class Country {
		
	@Id
	@NonNull private String code;
	private String name;
	private String continent;
	private String region;
	private Double surfaceArea;
	private Integer indepYear;
	private Integer population;
	private Double lifeExpectancy;
	private Double gnp;
	private Double gnpOld;
	private String localName;
	private String governmentForm;
	private String headOfState;
	

	@OneToOne
	
	private City capital;
	
	private String code2;
	
	@OneToMany(mappedBy ="languageCountryId.country")
	List<Countrylanguage> listOfLanguages;

}
