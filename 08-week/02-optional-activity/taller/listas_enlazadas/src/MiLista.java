import java.util.Scanner;

public class MiLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nodo cabeza = null;
        Nodo ultimo = null;

        System.out.println("--- Ingrese los nombres de 4 estudiantes ---");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Estudiante " + i + ": ");
            String nombre = sc.nextLine();

            // Creamos el nuevo nodo
            Nodo nuevo = new Nodo(nombre);

            // Lógica de enlace
            if (cabeza == null) {
                cabeza = nuevo; // El primero es la cabeza
                ultimo = nuevo;
            } else {
                ultimo.siguiente = nuevo; // El anterior apunta al nuevo
                ultimo = nuevo; // El nuevo ahora es el último
            }
        }

        // IMPRESIÓN DEL ESQUEMA VISUAL
        System.out.println("\n[ CABEZA ]");
        System.out.println("    ↓");

        // Fila 1: Techos
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print("+-----------+      ");
            temp = temp.siguiente;
        }
        System.out.println();

        // Fila 2: Nombres (limitados a 9 caracteres para no romper el dibujo)
        temp = cabeza;
        while (temp != null) {
            String n = (temp.nombre.length() > 9) ? temp.nombre.substring(0, 9) : temp.nombre;
            System.out.printf("| %-9s |      ", n);
            temp = temp.siguiente;
        }
        System.out.println();

        // Fila 3: Separador
        temp = cabeza;
        while (temp != null) {
            System.out.print("|-----------|      ");
            temp = temp.siguiente;
        }
        System.out.println();

        // Fila 4: Enlaces
        temp = cabeza;
        while (temp != null) {
            if (temp.siguiente != null) {
                System.out.print("|  Enlace  ------> ");
            } else {
                System.out.print("|   NULL    |      ");
            }
            temp = temp.siguiente;
        }
        System.out.println();

        // Fila 5: Bases
        temp = cabeza;
        while (temp != null) {
            System.out.print("+-----------+      ");
            temp = temp.siguiente;
        }
        System.out.println("\n   (Nodo 1)           (Nodo 2)           (Nodo 3)        (Último Nodo)");
    }
}