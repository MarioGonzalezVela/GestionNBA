package implementaciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;
import interfaces.JugadorDAO;
import modelos.Equipo;
import modelos.Jugador;

public class JugadorImp extends AbstractConexion implements JugadorDAO {

	Jugador jugador = new Jugador();

	@Override
	public Jugador findById(String nombre) {

		try {
			query = "SELECT * FROM jugadores WHERE nombre LIKE ?";
			pst = conn.prepareStatement(query);

			pst.setString(1, nombre);
			rs = pst.executeQuery();

			while (rs.next()) {

				int codigoJugador = rs.getInt(1);
				String nombreJugador = rs.getString(2);
				String procedenciaJugador = rs.getString(3);
				String alturaJugador = rs.getString(4);
				int pesoJugador = rs.getInt(5);
				String posicionJugador = rs.getString(6);
				String nombreEquipoJugador = rs.getString(7);

				jugador = new Jugador(codigoJugador, nombreJugador, procedenciaJugador, alturaJugador, pesoJugador,
						posicionJugador, nombreEquipoJugador);
			}

			pst.close();
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return jugador;
	}

	@Override
	public List<Jugador> findAll() {

		List<Jugador> listaJugadores = new ArrayList<>(5);
		
		try {
			query = "SELECT * FROM jugadores";
			pst = conn.prepareStatement(query);

			rs = pst.executeQuery();

			while (rs.next()) {

				int codigoJugador = rs.getInt(1);
				String nombreJugador = rs.getString(2);
				String procedenciaJugador = rs.getString(3);
				String alturaJugador = rs.getString(4);
				int pesoJugador = rs.getInt(5);
				String posicionJugador = rs.getString(6);
				String nombreEquipoJugador = rs.getString(7);

				jugador = new Jugador(codigoJugador, nombreJugador, procedenciaJugador, alturaJugador, pesoJugador,
						posicionJugador, nombreEquipoJugador);
				
				listaJugadores.add(jugador);
			}

			pst.close();
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listaJugadores;
	}

	@Override
	public boolean crearJugador(Jugador jugador) {
		return false;
	}

	@Override
	public boolean ficharJugador(Jugador jugador) {
		return false;
	}

	@Override
	public boolean pruebasFisicasJugador(Jugador jugador) {
		return false;
	}

	@Override
	public int retirarJugador(int codigo) {
		return 0;
	}

}
