package org.jesuitasrioja.ad1HB.persistencia;

import java.util.List;
import java.util.Set;

public interface IPersistencia {
	public Set<City> listaCiudades();

	public Set<Country> listaPaises();

	public Boolean existeCiudad(Integer codigoCiudad);

	//cambiado
	public Boolean existePais(String codigoPais);

	public City getCity(Integer codigoCiudad);

	public Country getCountry(String codigoPais);

	public Set<City> listaCiudades(String nombrePais);

	public Country getPaisDeCiudad(Integer codigoCiudad);

	//cambiado
	public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais);

	//cambiado
	public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre);

	public void aniadirCiudad(City nuevaCiudad);

	//cambiado
	public void aniadirPais(Country nuevaCiudad);

	public List<Countrylanguage> getAllLanguages();

	public Set<Countrylanguage> listaIdiomas(String codigoPais);

}
