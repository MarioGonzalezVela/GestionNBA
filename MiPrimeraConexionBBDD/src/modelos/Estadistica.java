package modelos;

public class Estadistica{

	private String temporada;
	private int jugador;
	private double puntosPorPartido,asistenciasPorPartido,taponesPorPartido,rebotesPorPartido;
	
	public Estadistica() {
		super();
	}

	public Estadistica(String temporada, int jugador, double puntosPorPartido, double asistenciasPorPartido,
			double taponesPorPartido, double rebotesPorPartido) {
		super();
		this.temporada = temporada;
		this.jugador = jugador;
		this.puntosPorPartido = puntosPorPartido;
		this.asistenciasPorPartido = asistenciasPorPartido;
		this.taponesPorPartido = taponesPorPartido;
		this.rebotesPorPartido = rebotesPorPartido;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public int getJugador() {
		return jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	public double getPuntosPorPartido() {
		return puntosPorPartido;
	}

	public void setPuntosPorPartido(double puntosPorPartido) {
		this.puntosPorPartido = puntosPorPartido;
	}

	public double getAsistenciasPorPartido() {
		return asistenciasPorPartido;
	}

	public void setAsistenciasPorPartido(double asistenciasPorPartido) {
		this.asistenciasPorPartido = asistenciasPorPartido;
	}

	public double getTaponesPorPartido() {
		return taponesPorPartido;
	}

	public void setTaponesPorPartido(double taponesPorPartido) {
		this.taponesPorPartido = taponesPorPartido;
	}

	public double getRebotesPorPartido() {
		return rebotesPorPartido;
	}

	public void setRebotesPorPartido(double rebotesPorPartido) {
		this.rebotesPorPartido = rebotesPorPartido;
	}

	@Override
	public String toString() {
		return "\nEstadística \n Temporada: " + temporada + "\n Jugador: " + jugador + "\n Puntos_por_partido: " + puntosPorPartido
				+ "\n Asistencias_por_partido: " + asistenciasPorPartido + "\n Tapones_por_partido: " + taponesPorPartido
				+ "\n Rebotes_por_partido: " + rebotesPorPartido + "\n";
	}
	
	
}
