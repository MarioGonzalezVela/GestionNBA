package interfaces;

import java.util.List;
import modelos.Equipo;

/**
 * @author Mario
 * @version 1
 */

public interface EquipoDAO {

	 Equipo findById(String nombre);
	 List<Equipo> findAll();
	 int eliminarEquipo(String nombre);
	 boolean crearEquipo(Equipo equipo);
	 boolean cambioDivision(Equipo equipo); 

}
