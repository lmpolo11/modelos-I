package co.edu.udistrital;

import co.edu.udistrital.bd.*;
import co.edu.udistrital.interfaces.FabricaAbstracta;
import co.edu.udistrital.interfaces.IConexionBD;
import co.edu.udistrital.interfaces.IConexionREST;

public class App {

	public static void main(String[] args) {
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com");
	}

}
