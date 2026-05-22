package poo.pagina40.ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int acumuladoNivel1 = 40; // Puntaje inicial
        int puntosNivel2 = 0;

        System.out.println("=== BIENVENIDO AL NIVEL 2 ===");

        String[] q = {"¿La ballena es mamífero? (s/n)", "¿El Sol es una estrella? (s/n)",
                "¿Java es un sistema operativo? (s/n)", "¿2+2*2 es 8? (s/n)"};
        String[] a = {"s", "s", "n", "n"};

        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + ": ");
            if (lector.next().equalsIgnoreCase(a[i])) {
                puntosNivel2 += 20;
                System.out.println("-> ¡Excelente!");
            } else {
                puntosNivel2 -= 10;
                System.out.println("-> Error...");
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Puntaje Nivel 2: " + puntosNivel2);
        System.out.println("Puntaje Total Acumulado: " + (acumuladoNivel1 + puntosNivel2));
    }
}