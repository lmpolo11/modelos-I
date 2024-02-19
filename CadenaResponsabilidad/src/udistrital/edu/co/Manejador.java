package udistrital.edu.co;

abstract class Manejador {

    protected Manejador sucesor;

    public void setSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }

    abstract void manejarPeticion(Peticion peticion);

}
