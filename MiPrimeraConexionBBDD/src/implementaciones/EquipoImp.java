package implementaciones;

import java.sql.Connection;

/**
 * @author Mario
 * @version 1
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Conexiones.AbstractConexion;
import Conexiones.Conexion;
import interfaces.EquipoDAO;
import modelos.Equipo;

public class EquipoImp extends AbstractConexion implements EquipoDAO{

	Equipo equipo = new Equipo();
	
	@Override
	public Equipo findById(String nombre) {
		
		try {
			query = "SELECT * FROM equipos WHERE nombre LIKE ?";
			pst = conn.prepareStatement(query);

			pst.setString(1, nombre);
			rs = pst.executeQuery();
		
			while(rs.next()) {
				
				String nombreEquipo = rs.getString(1);
				String ciudadEquipo = rs.getString(2);
				String conferenciaEquipo = rs.getString(3);
				String divisionEquipo = rs.getString(4);
				
				equipo = new Equipo(nombreEquipo,ciudadEquipo,conferenciaEquipo,divisionEquipo);
			}
			
			
			pst.close();
			rs.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return equipo;	
	}

	@Override
	public List<Equipo> findAll() {
		
		List<Equipo> listaEquipos = new ArrayList<>(5);
		try {
			query = "SELECT * FROM equipos";
			pst = conn.prepareStatement(query);

			rs = pst.executeQuery();
		
			while(rs.next()) {
				
				String nombreEquipo = rs.getString(1);
				String ciudadEquipo = rs.getString(2);
				String conferenciaEquipo = rs.getString(3);
				String divisionEquipo = rs.getString(4);
				
				equipo = new Equipo(nombreEquipo,ciudadEquipo,conferenciaEquipo,divisionEquipo);
				
				listaEquipos.add(equipo);
			}
			
			
			pst.close();
			rs.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listaEquipos;	
	}

	@Override
	public int eliminarEquipo(String nombre) {
		return 0;
	}

	@Override
	public boolean crearEquipo(Equipo equipo) {
		return false;
	}

	@Override
	public boolean cambioDivision(Equipo equipo) {
		return false;
	}

}
