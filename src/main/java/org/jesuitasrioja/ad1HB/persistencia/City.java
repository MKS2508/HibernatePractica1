package org.jesuitasrioja.ad1HB.persistencia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
	
	@NonNull private Integer id;
	private String name;
	private Country country;
	private String district;
	private Integer population;

}
