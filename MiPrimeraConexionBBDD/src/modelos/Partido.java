
/**
 * @author Mario
 * @version 1
 */

package modelos;

public class Partido{
	
	private int codigo,puntosLocal,puntosVisitante;
	private String equipoLocal,equipoVisitante,temporada;
	
	public Partido() {
		super();
	}

	public Partido(int codigo, String equipoLocal, String equipoVisitante, int puntosLocal, int puntosVisitante,
			String temporada) {
		super();
		this.codigo = codigo;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
		this.temporada = temporada;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPuntosLocal() {
		return puntosLocal;
	}

	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}

	public int getPuntosVisitante() {
		return puntosVisitante;
	}

	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "\nPartido: \n Código: " + codigo + "\n Puntos_local: " + puntosLocal + "\n Puntos_visitante: " + puntosVisitante
				+ "\n Equipo_local: " + equipoLocal + "\n Equipo_visitante: " + equipoVisitante + "\n Temporada: " + temporada
				+ "\n";
	}
	
	

}
