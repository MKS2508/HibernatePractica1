package org.jesuitasrioja.ad1HB.persistencia;

import java.util.List;
import java.util.Set;

public class PersistenciaHB implements IPersistencia{

	@Override
	public Set<City> listaCiudades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Country> listaPaises() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existeCiudad(Integer codigoCiudad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existePais(String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City getCity(Integer codigoCiudad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country getCountry(String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<City> listaCiudades(String nombrePais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country getPaisDeCiudad(Integer codigoCiudad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aniadirCiudad(City nuevaCiudad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aniadirPais(Country nuevaCiudad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Countrylanguage> getAllLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Countrylanguage> listaIdiomas(String codigoPais) {
		// TODO Auto-generated method stub
		return null;
	}

}
