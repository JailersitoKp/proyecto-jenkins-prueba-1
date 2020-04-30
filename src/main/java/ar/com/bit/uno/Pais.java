package ar.com.bit.uno;

import java.util.ArrayList;
import java.util.Collection;

public class Pais {

		// atributos
	private String nombre;
	private Collection<Equipo> equipos;

		// constructores
	public Pais() {
		super();
		this.equipos = new ArrayList<Equipo>();
	}

	public Pais(String nombre) {
		this();
		this.nombre = nombre;
	}

		// metodos
	public void agregarEquipo(Equipo equipo) {
		equipo.setPais(this);
		this.equipos.add(equipo);
	}

		// gets y sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Collection<Equipo> equipos) {
		this.equipos = equipos;
	}

}
