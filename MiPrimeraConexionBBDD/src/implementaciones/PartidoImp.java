package implementaciones;

import java.sql.SQLException;

import Conexiones.AbstractConexion;
import interfaces.PartidoDAO;
import modelos.Equipo;
import modelos.Partido;

public class PartidoImp extends AbstractConexion implements PartidoDAO {

	@Override
	public void visualizarDatos(Partido partido) {

		try {
			query = "SELECT * FROM partidos";
			pst = conn.prepareStatement(query);

			rs = pst.executeQuery();

			while (rs.next()) {

				System.out.println();
			}

			pst.close();
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public double mediaPuntos(Equipo equipo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaAsistencias(Equipo equipo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaTapones(Equipo equipo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaRebotes(Equipo equipo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaPuntosLocal(Partido partido) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediaPuntosVisitante(Partido partido) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double porcentajeVictorias(Partido partido) {
		// TODO Auto-generated method stub
		return 0;
	}

}
