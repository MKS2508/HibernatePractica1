package org.jesuitasrioja.ad1HB.persistencia;

import java.util.List;
import java.util.Set;

import org.jesuitasrioja.ad1HB.pojos.City;
import org.jesuitasrioja.ad1HB.pojos.Country;
import org.jesuitasrioja.ad1HB.pojos.Countrylanguage;

public interface IPersistencia {
	
	public Set<City> listaCiudades();

	public Set<Country> listaPaises();

	public Boolean existeCiudad(Integer codigoCiudad);

	public Boolean existePais(String codigoPais);

	public City getCity(Integer codigoCiudad);

	public Country getCountry(String codigoPais);

	public Set<City> listaCiudades(String nombrePais);

	public Country getPaisDeCiudad(Integer codigoCiudad);

	public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais);

	public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre);

	public void aniadirCiudad(City nuevaCiudad);

	public void aniadirPais(Country nuevaCiudad);

	public List<Countrylanguage> getAllLanguages();

	public Set<Countrylanguage> listaIdiomas(String codigoPais);

}
