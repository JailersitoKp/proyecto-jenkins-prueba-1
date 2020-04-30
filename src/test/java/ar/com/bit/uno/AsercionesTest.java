package ar.com.bit.uno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AsercionesTest {

	private static Collection<Pais> paises;

	@BeforeAll
	public static void initAll() {
		Pais arg = new Pais("Argentina");
		Pais bra = new Pais("Brasil");
		Pais uru = new Pais("Uruguay");
		arg.agregarEquipo(new Equipo("Lamadrid", "carcelero"));
		arg.agregarEquipo(new Equipo("River Plate", "millonario"));
		bra.agregarEquipo(new Equipo("Flamengo", "niidea"));
		bra.agregarEquipo(new Equipo("Corintians", "timao"));
		uru.agregarEquipo(new Equipo("Nacional", "nose"));
		uru.agregarEquipo(new Equipo("Peñarol", "carbonero"));
		paises = new ArrayList<Pais>();
		paises.add(arg);
		paises.add(bra);
		paises.add(uru);
	}

	@Test
	public void cantidadPaises() {
		assertEquals(3, paises.size());
	}

}
