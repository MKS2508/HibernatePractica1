package org.jesuitasrioja.ad1HB.persistencia;



/**
 * @author DAM212 [Adrián Ruiz Díez]
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import persistencia.IPersistencia;

public class PersistenciaJDBC implements IPersistencia {
	public Set<City> listaCiudades() {
		Connection con = null;
		try {
			Set<City> cities = new HashSet<>();
			City city = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM city");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				city = new City(rs.getInt(1), rs.getString(2), this.getCountry(rs.getString(3)), rs.getString(4),
						rs.getInt(5));
				cities.add(city);
			}

			rs.close();
			con.close();
			return cities;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Set<Country> listaPaises() {
		Connection con = null;
		try {
			Set<Country> countries = new HashSet<>();
			Country country = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM country");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				country = new Country(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getInt(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10),
						rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14), rs.getString(15));
				countries.add(country);
			}

			rs.close();
			con.close();
			return countries;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Boolean existeCiudad(Integer codigoCiudad) {
		try {
			@SuppressWarnings("unused")
			City city = null;
			Connection con = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM city WHERE ID = ?");
			ps.setInt(1, codigoCiudad);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				rs.close();
				con.close();
				return true;
			} else {
				rs.close();
				con.close();
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Boolean ExistePais(String codigoPais) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM country WHERE Code = ?");
			ps.setString(1, codigoPais);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				rs.close();
				con.close();
				return true;
			} else {
				rs.close();
				con.close();
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public City getCity(Integer codigoCiudad) {
		Connection con = null;
		try {
			City city = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM city WHERE ID = ?");
			ps.setInt(1, codigoCiudad);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				city = new City(rs.getInt(1), rs.getString(2), this.getCountry(rs.getString(3)), rs.getString(4),
						rs.getInt(5));
			}

			rs.close();
			con.close();
			return city;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Country getCountry(String codigoPais) {
		Connection con = null;
		try {
			Country country = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM country WHERE code = ?");
			ps.setString(1, codigoPais);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				country = new Country(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getInt(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10),
						rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14), rs.getString(15));
			}

			rs.close();
			con.close();
			return country;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Set<City> listaCiudades(String nombrepais) {
		Connection con = null;
		try {
			Set<City> cities = new HashSet<>();
			City city = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM city WHERE CountryCode = ?");
			ps.setString(1, nombrepais);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				city = new City(rs.getInt(1), rs.getString(2), this.getCountry(rs.getString(3)), rs.getString(4),
						rs.getInt(5));
				cities.add(city);
			}

			rs.close();
			con.close();
			return cities;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Country getPaisDeCiudad(Integer codigoCiudad) {
		Connection con = null;
		try {
			City city = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM city WHERE ID = ?");
			ps.setInt(1, codigoCiudad);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				city = new City(rs.getInt(1), rs.getString(2), this.getCountry(rs.getString(3)), rs.getString(4),
						rs.getInt(5));
			}

			Country country = city.getCountry();

			rs.close();
			con.close();
			return country;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Boolean estaCiudadEnPais(Integer codigoCiudad, String codigoPais) {
		Connection con = null;
		try {
			City city = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM city WHERE ID = ?");
			ps.setInt(1, codigoCiudad);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				city = new City(rs.getInt(1), rs.getString(2), this.getCountry(rs.getString(3)), rs.getString(4),
						rs.getInt(5));
			}

			rs.close();
			con.close();
			if (codigoPais.equals(city.getCountry().getCode())) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public void cambiarNombreCiudad(Integer codigoCiudad, String nuevoNombre) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("UPDATE city SET Name = ? WHERE ID = ?");
			ps.setString(1, nuevoNombre);
			ps.setInt(2, codigoCiudad);
			ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Boolean aniadirCiudad(City nuevaCiudad) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("INSERT INTO city VALUES (?,?,?,?,?)");
			ps.setInt(1, nuevaCiudad.getID());
			ps.setString(2, nuevaCiudad.getName());
			ps.setString(3, nuevaCiudad.getCountry().getCode());
			ps.setString(4, nuevaCiudad.getDistrict());
			ps.setInt(5, nuevaCiudad.getPopulation());
			ps.executeUpdate();

			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public void aniadirPais(Country nuevoPais) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("INSERT INTO country VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, nuevoPais.getCode());
			ps.setString(2, nuevoPais.getName());
			ps.setString(3, nuevoPais.getContinent());
			ps.setString(4, nuevoPais.getRegion());
			ps.setDouble(5, nuevoPais.getSurfaceArea());
			ps.setInt(6, nuevoPais.getIndepYear());
			ps.setInt(7, nuevoPais.getPopulation());
			ps.setDouble(8, nuevoPais.getLifeExpectancy());
			ps.setDouble(9, nuevoPais.getGnp());
			ps.setDouble(10, nuevoPais.getGnpOld());
			ps.setString(11, nuevoPais.getLocalname());
			ps.setString(12, nuevoPais.getGovernmentForm());
			ps.setString(13, nuevoPais.getHeadOfState());
			ps.setInt(14, nuevoPais.getCapital1());
			ps.setString(15, nuevoPais.getCode2());
			ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Countrylanguaje> getAllLanguajes() {
		Connection con = null;
		try {
			List<Countrylanguaje> languajes = new ArrayList<>();
			Countrylanguaje languaje = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT DISTINCT language FROM countrylanguage");

			ResultSet rs = ps.executeQuery();

			/*
			 * He creado un cosntructor solo del parametro de language para esto porque
			 * quería probar a hacerlo así, pero me daría lo mismo pedir todos los datos
			 * porque al final lo que paso es toda la clase, solo que en los demás datos en
			 * vez de tenerlos, hay nulls.
			 * 
			 * Esto es tanto por probar como porque supongo que si solo se le pide a la BD
			 * los datos que se buscan y no más, (y por supuesto tampoco menos), procesar la
			 * funcion es más sencillo.
			 * 
			 * Habría devuelto solo un array/set/lo que sea, con tan solo lo que quiero, los
			 * lenguajes; pero como esta funcion en el ejercico dice que ha de devolver un
			 * list con todos los atributos de la clase countrylanguaje pues lo hago así.
			 */
			while (rs.next()) {
				languaje = new Countrylanguaje(rs.getString(1));
				languajes.add(languaje);
			}

			rs.close();
			con.close();
			return languajes;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Set<Countrylanguaje> listaidiomas(String codigoPais) {
		Connection con = null;
		try {
			Set<Countrylanguaje> languajes = new HashSet<>();
			Countrylanguaje languaje = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "root");

			PreparedStatement ps = con
					.prepareStatement("SELECT DISTINCT language FROM countrylanguage WHERE CountryCode = ?");
			ps.setString(1, codigoPais);

			ResultSet rs = ps.executeQuery();

			/*
			 * He creado un cosntructor solo del parametro de language para esto porque
			 * quería probar a hacerlo así, pero me daría lo mismo pedir todos los datos
			 * porque al final lo que paso es toda la clase, solo que en los demás datos en
			 * vez de tenerlos, hay nulls.
			 * 
			 * Esto es tanto por probar como porque supongo que si solo se le pide a la BD
			 * los datos que se buscan y no más, (y por supuesto tampoco menos), procesar la
			 * funcion es más sencillo.
			 * 
			 * Habría devuelto solo un array/set/lo que sea, con tan solo lo que quiero, los
			 * lenguajes; pero como esta funcion en el ejercico dice que ha de devolver un
			 * set con todos los atributos de la clase countrylanguaje pues lo hago así.
			 */
			while (rs.next()) {
				languaje = new Countrylanguaje(rs.getString(1));
				languajes.add(languaje);
			}

			rs.close();
			con.close();
			return languajes;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}