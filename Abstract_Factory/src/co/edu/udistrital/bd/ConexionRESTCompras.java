package co.edu.udistrital.bd;

import co.edu.udistrital.interfaces.*;

public class ConexionRESTCompras implements IConexionREST{

	@Override
	public void leerURL(String url) {		
		System.out.println("Conectándose a " + url);
	}

}
