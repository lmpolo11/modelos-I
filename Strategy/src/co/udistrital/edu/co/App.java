package co.udistrital.edu.co;

import co.udistrital.edu.co.strategy.*;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
	}

}
