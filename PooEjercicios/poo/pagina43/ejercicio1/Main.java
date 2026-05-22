package poo.pagina43.ejercicio1;

class PersonaSeleccion {
    protected String nombre;
    protected int edad;

    public void presentarse() {
        System.out.println("Soy " + nombre + " y estoy en la selección.");
    }
}

class Entrenador extends PersonaSeleccion {
    public void planificar() { System.out.println("Planificando estrategia..."); }
}

class Masajista extends PersonaSeleccion {
    public void darMasaje() { System.out.println("Realizando terapia física..."); }
}

public class Main {
    public static void main(String[] args) {
        Entrenador coach = new Entrenador();
        coach.nombre = "Mister X";
        coach.presentarse();
        coach.planificar();
    }
}