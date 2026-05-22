package poo.pagina47.ejercicio3;

interface Profesion {
    double calcularSueldo();
}

class Arquitecto implements Profesion {
    private int horasTrabajadas = 120;
    private double pagoPorHora = 25.50;

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }
}

class Medico implements Profesion {
    private double sueldoMensual = 2500.00;
    private double bonoGuardias = 600.00;

    @Override
    public double calcularSueldo() {
        return sueldoMensual + bonoGuardias;
    }
}

public class profesion {
    public static void main(String[] args) {
        Profesion arquitecto = new Arquitecto();
        Profesion medico = new Medico();

        System.out.println("=== SUELDOS POR PROFESIÓN ===");
        System.out.println("Sueldo del Arquitecto: $" + arquitecto.calcularSueldo());
        System.out.println("Sueldo del Médico: $" + medico.calcularSueldo());
    }
}