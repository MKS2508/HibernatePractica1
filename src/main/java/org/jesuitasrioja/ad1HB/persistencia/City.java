package org.jesuitasrioja.ad1HB.persistencia;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class City {
	
	@Id @Include
	private Integer id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Country country;
	
	private String district;
	private Integer population;

}
