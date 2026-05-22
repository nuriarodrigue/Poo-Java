package poo.pagina47.ejercicio1;

class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está desplazando.");
    }
}

class Automovil extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El automóvil avanza por la carretera sobre 4 ruedas.");
    }
}

class Barco extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El barco navega sobre el agua.");
    }
}

class Avion extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El avión vuela cruzando los cielos.");
    }
}

public class vehiculo {
    public static void main(String[] args) {
        // Polimorfismo en acción
        Vehiculo v1 = new Automovil();
        Vehiculo v2 = new Barco();
        Vehiculo v3 = new Avion();

        System.out.println("=== POLIMORFISMO DE VEHÍCULOS ===");
        v1.moverse();
        v2.moverse();
        v3.moverse();
    }
}