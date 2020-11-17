package org.jesuitasrioja.ad1HB.persistencia;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {
	
	@NonNull private Integer id;
	private String name;
	private Country country;
	private String district;
	private Integer population;

}
