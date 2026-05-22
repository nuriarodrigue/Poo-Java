package poo.pagina40.Ejercicio1;

class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    // Constructor vacío
    public Animal() {}

    // Métodos de acceso (Encapsulamiento)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getOrden() { return orden; }
    public void setOrden(String orden) { this.orden = orden; }

    public int getExtremidades() { return extremidades; }
    public void setExtremidades(int extremidades) { this.extremidades = extremidades; }
}

public class Main {
    public static void main(String[] args) {
        Animal mascota = new Animal();
        mascota.setNombre("Gato");
        mascota.setOrden("Felino");
        mascota.setExtremidades(4);

        System.out.println("Mascota registrada: " + mascota.getNombre() + " (" + mascota.getOrden() + ")");
    }
}
