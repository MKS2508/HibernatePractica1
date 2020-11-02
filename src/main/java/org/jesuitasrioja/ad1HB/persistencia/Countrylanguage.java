package org.jesuitasrioja.ad1HB.persistencia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countrylanguage {
	
	@NonNull private String countryCode;
	@NonNull private String language;
	private String isOfficial;
	private Double percentage;

}
