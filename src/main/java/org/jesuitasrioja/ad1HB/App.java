/*
 * 
 * 1. Anotaciones Lombok
 * 2. HibernateUtil.java
 * 3. Hibernate.cfg.xml
 * 4. Anotaciones basicas de HB :
 * 		- ID, Entity, Table, Column, Embeddable, EmbeddableId
 * 5. Anotaciones relaciones HB
 * 		- OneToOne, OneToMany, ManyToMany, JoinColumn..
 * 6. Atributos anotaciones de relaciones
 * 		- mappedBy, cascade.ALL .....
 * 7. Aniadir mappings en hb.cfg.xml 
 * 
 * */

/*
 * 
 * Metodos a implementar:
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
 * 
 * */

package org.jesuitasrioja.ad1HB;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jesuitasrioja.ad1HB.*;
import org.jesuitasrioja.ad1HB.persistencia.PersistenciaHB;
import org.jesuitasrioja.ad1HB.pojos.*;
import org.jesuitasrioja.*;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		PersistenciaHB hb = new PersistenciaHB();

//		
//		System.out.println(hb.getCity(699));
//		System.out.println(hb.getCountry("ESP"));
//		System.out.println(hb.listaCiudades());
//		System.out.println(hb.listaPaises());
//		System.out.println(hb.existeCiudad(699).toString());
//		System.out.println(hb.existePais("ESP").toString());
//		System.out.println(hb.listaCiudades("ESP")); 				TODO: arreglar!!!
//		System.out.println(hb.listaIdiomas("ESP"));  				TODO: arreglar!!!
		
		
//		List<Countrylanguage> lista = hb.getAllLanguages();
//
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		



	}
}