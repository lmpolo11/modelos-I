package co.udistrital.edu.co.strategy;

public class Contexto {
	
	private IEstrategia estrategia;
	
	public Contexto(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.analizar();
	}

}
