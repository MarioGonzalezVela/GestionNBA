package aplicacion;

import java.sql.Connection;

/**
 * @author Mario
 * @version 1
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.AbstractConexion;
import implementaciones.EquipoImp;
import implementaciones.EstadisticaImp;
import implementaciones.JugadorImp;
import implementaciones.PartidoImp;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Partido;

public class Main extends AbstractConexion {

	
	public static void main(String[] args)  {
		
//		Menu menu = new Menu();
//		menu.mostrarOpciones("1. Tabla Equipos,2. Tabla Jugadores,2. Tabla Estadísticas,4. Tabla Partidos");

	
		Partido partido = new Partido();
		PartidoImp p = new PartidoImp();
		
		Equipo equipo = new Equipo();
		EquipoImp eq = new EquipoImp();
		
		Estadistica estadistica = new Estadistica();
		EstadisticaImp est = new EstadisticaImp();
		
	
		System.out.println(eq.findAll());
	
		System.out.println(eq.findById("Celtics"));
		
		System.out.println("-------------------------");
		

		System.out.println(est.findById(1));
		
		System.out.println("-------------------------");
		
		JugadorImp j = new JugadorImp();
		System.out.println(j.findAll());
		System.out.println(j.findById("Rudy Gay"));
		
		System.out.println("-------------------------");
		
		System.out.println("-------------------------");
		
		partido.setCodigo(2);
		p.visualizarDatos(partido);
	}

}
