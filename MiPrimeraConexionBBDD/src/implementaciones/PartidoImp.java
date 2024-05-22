package implementaciones;

import java.sql.SQLException;
import Conexiones.AbstractConexion;
import interfaces.PartidoDAO;
import modelos.Equipo;
import modelos.Partido;

/**
 * @author Mario
 * @version 1
 */

public class PartidoImp extends AbstractConexion implements PartidoDAO {

	@Override
	public void visualizarDatos(Partido partido) {

		try {
			query = "SELECT * FROM partidos WHERE codigo = ?";
			pst = conn.prepareStatement(query);

			pst.setInt(1, partido.getCodigo());
			rs = pst.executeQuery();

			while (rs.next()) {

				System.out.println("\nPartido: \n");
				System.out.println(" Código: " + rs.getString(1));
				System.out.println(" Equipo_local: " + rs.getString(2));
				System.out.println(" Equipo_visitante: " + rs.getString(3));
				System.out.println(" Puntos_local: " + rs.getString(4));
				System.out.println(" Puntos_visitante: " + rs.getString(5));
				System.out.println(" Temporada: " + rs.getString(6));
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
