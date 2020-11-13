package org.jesuitasrioja.ad1HB.persistencia;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.jesuitasrioja.ad1HB.pojos.City;
import org.jesuitasrioja.ad1HB.pojos.Country;
import org.jesuitasrioja.ad1HB.pojos.Countrylanguage;

public class PersistenciaHB implements IPersistencia {

	@Override
	public Set<City> listaCiudades() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from City c");

		List listaCity = q.getResultList();

		Set setCity = new HashSet<City>(listaCity);
		s.close();
		return setCity;
	}

	@Override
	public Set<Country> listaPaises() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Country c");

		List listaCountry = q.getResultList();

		Set setCountry = new HashSet<Country>(listaCountry);
		s.close();
		return setCountry;
	}

	@Override
	public Boolean existeCiudad(Integer codigoCiudad) {
		Boolean existe = null;

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		City c = session.get(City.class, codigoCiudad);
		if (c != null) {
			existe = true;
		} else {
			existe = false;
		}

		session.close();
		return existe;
	}

	@Override
	public Boolean existePais(String codigoPais) {
		Boolean existe = null;

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Country c = session.get(Country.class, codigoPais);
		if (c != null) {
			existe = true;
		} else {
			existe = false;
		}

		session.close();
		return existe;
	}

	@Override
	public City getCity(Integer codigoCiudad) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		City c = session.get(City.class, codigoCiudad);

		session.close();
		return c;
	}

	@Override
	public Country getCountry(String codigoPais) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Country c = session.get(Country.class, codigoPais);

		session.close();
		return c;
	}

	@Override
	public Set<City> listaCiudades(String nombrePais) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from City c where c.CountryCode = :code");
		q.setParameter("code", nombrePais);
		List listaCity = q.getResultList();

		Set setCity = new HashSet<City>(listaCity);
		s.close();
		return setCity;
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
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Countrylanguage cl");
		List listaIdiomas = q.getResultList();

//		Set setIdiomas = new HashSet<City>(listaIdiomas);
		s.close();
		
		return listaIdiomas;
	}

	@Override
	public Set<Countrylanguage> listaIdiomas(String codigoPais) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Query q = s.createQuery("from Countrylanguage cl where cl.CountryCode = ESP");
		q.setParameter("code", codigoPais);
		List listaIdiomasParam = q.getResultList();

		Set setCity = new HashSet<City>(listaIdiomasParam);
		s.close();
		return setCity;
	}

}
