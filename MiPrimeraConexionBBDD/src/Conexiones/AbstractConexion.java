package Conexiones;

import java.sql.Connection;

/**
 * @author Mario
 * @version 1
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractConexion {
	protected  Connection conn;
	protected  Statement st;
	protected  PreparedStatement pst;
	protected  ResultSet rs;
	protected  String query;
	
	protected AbstractConexion() {
		conn=Conexion.getConnection();
	}
}
