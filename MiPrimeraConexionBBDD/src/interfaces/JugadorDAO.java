package interfaces;

import java.util.List;
import modelos.Jugador;

/**
 * @author Mario
 * @version 1
 */

public interface JugadorDAO {

	 Jugador findById(String nombre);
	 List<Jugador> findAll();
	 boolean crearJugador(Jugador jugador);
	 boolean ficharJugador(Jugador jugador);
	 boolean pruebasFisicasJugador(Jugador jugador);
	 int retirarJugador(int codigo);

}
