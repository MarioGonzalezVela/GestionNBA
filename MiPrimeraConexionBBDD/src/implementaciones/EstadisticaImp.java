package implementaciones;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexiones.AbstractConexion;
import interfaces.EstadisticaDAO;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Jugador;

public class EstadisticaImp extends AbstractConexion implements EstadisticaDAO {

	List<Estadistica> listaEstadisticas = new ArrayList<>(5);
	Estadistica estadistica = new Estadistica();

	@Override
	public List<Estadistica> findById(int jugador) { // Como código tomo el id del jugador

		try {
			query = "SELECT * FROM estadisticas WHERE jugador LIKE ?";
			pst = conn.prepareStatement(query);

			pst.setInt(1, jugador);
			rs = pst.executeQuery();

			while (rs.next()) {

				String temporadaEstadistica = rs.getString(1);
				int jugadorEstadistica = rs.getInt(2);
				double puntosPartidoEstadistica = rs.getDouble(3);
				double asistenciasPartidoEstadistica = rs.getDouble(4);
				double taponesPartidoEstadistica = rs.getDouble(5);
				double rebotesPartidoEstadistica = rs.getDouble(6);
				
				estadistica = new Estadistica(temporadaEstadistica, jugadorEstadistica, puntosPartidoEstadistica, asistenciasPartidoEstadistica,taponesPartidoEstadistica,rebotesPartidoEstadistica);
			}

			listaEstadisticas.add(estadistica);
			pst.close();
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listaEstadisticas;
	}

	@Override
	public List<Estadistica> findByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estadistica> findByEquipo(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double mediaPuntosPartido(Jugador jugador) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaAsistencias(Jugador jugador) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaTapones(Jugador jugador) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaRebotes(Jugador jugador) {
		// TODO Auto-generated method stub
		return 0;
	}

}
