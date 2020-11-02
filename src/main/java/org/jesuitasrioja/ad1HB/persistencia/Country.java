package org.jesuitasrioja.ad1HB.persistencia;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
		
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
	private City capital;
	private String code2;
	List<Countrylanguage> listOfLanguages;

}
