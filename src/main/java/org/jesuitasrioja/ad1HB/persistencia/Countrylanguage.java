package org.jesuitasrioja.ad1HB.persistencia;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "countrylanguage")
public class Countrylanguage {
	
	@NonNull String language;
	private String isOfficial;
	private Double percentage;

}
