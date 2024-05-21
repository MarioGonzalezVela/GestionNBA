package aplicacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.AbstractConexion;
import implementaciones.EquipoImp;
import implementaciones.EstadisticaImp;
import implementaciones.JugadorImp;
import modelos.Equipo;

public class Main extends AbstractConexion {

	
	public static void main(String[] args)  {
	
		EquipoImp e = new EquipoImp();
		System.out.println(e.findAll());
		
//		e.findAll();
//		System.out.println(e.findById("Celtics"));
		
		System.out.println("-------------------------");
		
		EstadisticaImp est = new EstadisticaImp();
		System.out.println(est.findById(2));
		
		System.out.println("-------------------------");
		
		JugadorImp j = new JugadorImp();
		System.out.println(j.findAll());
//		System.out.println(j.findById("Rudy Gay")); //Cambio en rama main

	}

}
