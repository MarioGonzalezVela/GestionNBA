package interfaces;

import java.util.List;

import modelos.Equipo;

public interface EquipoDAO {

	 Equipo findById(String nombre);
	 List<Equipo> findAll();
	 int eliminarEquipo(String nombre);
	 boolean crearEquipo(Equipo equipo);
	 boolean cambioDivision(Equipo equipo); 

}
