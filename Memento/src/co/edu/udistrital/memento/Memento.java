package co.edu.udistrital.memento;

public class Memento {

	private Juego estado;

	public Memento(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

}
