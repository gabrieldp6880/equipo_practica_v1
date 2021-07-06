package practica;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class EquipoDeFutbol {
	private String nombre;
	private Set<Jugador> jugadores;

	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores = new TreeSet<Jugador>();
	}

	/*
	 * La capacidad máxima de un equipo es 23. Cualquier intento de agregar más
	 * jugadores generará una excepción (CapacidadMaximaException). Además, no
	 * deberá permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) {

	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generará una excepción
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) {
		return null;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
		
		return null;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		return null;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		return null;
	}

	private TreeSet<Jugador> ordenarELPlantelParaDevolver(Comparator criterioDeOrdenacion) {
		TreeSet<Jugador> equipoOrdenado = null;
			return equipoOrdenado;

	}
}
