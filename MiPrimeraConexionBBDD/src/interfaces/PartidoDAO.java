package interfaces;

import modelos.Equipo;
import modelos.Partido;

/**
 * @author Mario
 * @version 1
 */

public interface PartidoDAO {

	 void visualizarDatos(Partido partido);
	 double mediaPuntos(Equipo equipo);
	 double mediaAsistencias(Equipo equipo);
	 double mediaTapones(Equipo equipo);
	 double mediaRebotes(Equipo equipo);
	 double mediaPuntosLocal(Partido partido);
	 double mediaPuntosVisitante(Partido partido);
	 double porcentajeVictorias(Partido partido);

}
