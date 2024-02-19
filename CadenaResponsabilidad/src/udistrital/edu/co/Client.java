package udistrital.edu.co;

public class Client {

    public static void main(String[] args) {

        Manejador m1 = new ManejadorConcreto1();
        Manejador m2 = new ManejadorConcreto2();

        m1.setSucesor(m2);
        m1.manejarPeticion(new Peticion("Negativo ", -100));
        m1.manejarPeticion(new Peticion("Negativo ", -27));
        m1.manejarPeticion(new Peticion("Positivo ", 5));
        m1.manejarPeticion(new Peticion("Negativo ", 80));
    }

}
