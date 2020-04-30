package ar.com.bit.uno;

public class Equipo {

		// atributos
	private String nombre;
	private String apodo;
	private Pais pais;

		// constructores
	public Equipo() {
		super();
	}

	public Equipo(String nombre, String apodo) {
		this();
		this.nombre = nombre;
		this.apodo = apodo;
	}

		// gets y sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
