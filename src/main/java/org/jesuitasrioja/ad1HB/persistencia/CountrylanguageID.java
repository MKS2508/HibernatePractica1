package org.jesuitasrioja.ad1HB.persistencia;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Embeddable
public class CountrylanguageID implements Serializable {
	
	String language;
	
	@ManyToOne
	Country country;

}
