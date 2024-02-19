package co.udistrital.edu.co.strategy;

public abstract class AnalisisSimple implements IEstrategia {
	
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}

	abstract void iniciar();

	abstract void saltarZip();

	abstract void detener();
}
