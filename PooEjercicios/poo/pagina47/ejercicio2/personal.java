package poo.pagina47.ejercicio2;

abstract class Personal {
    // Métodos abstractos a ser implementados por las clases hijas
    public abstract void registrar();
    public abstract double calcularSueldo();
}

class Empleado extends Personal {
    private String nombre;
    private double salarioBase;

    @Override
    public void registrar() {
        this.nombre = "Carlos Perez";
        this.salarioBase = 800.00;
        System.out.println("Empleado registrado: " + this.nombre);
    }

    @Override
    public double calcularSueldo() {
        // Ejemplo de cálculo: salario base + bono del 10%
        return this.salarioBase + (this.salarioBase * 0.10);
    }
}

public class personal {
    public static void main(String[] args) {
        Personal empleado1 = new Empleado();

        System.out.println("=== GESTIÓN DE PERSONAL ===");
        empleado1.registrar();
        System.out.println("Sueldo total calculado: $" + empleado1.calcularSueldo());
    }
}