package modelos;

public class Equipo{

	private String nombre,ciudad,conferencia,division;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, String ciudad, String conferencia, String division) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	@Override
	public String toString() {
		return "Equipo: \n Nombre: " + nombre + "\n Ciudad: " + ciudad + "\n Conferencia: " + conferencia + "\n División: "
				+ division + "\n";
	}
}
