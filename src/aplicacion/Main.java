package aplicacion;

import dominio.Estudiante;

public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Álvaro", 19, 6.8);
        Estudiante e2 = new Estudiante("Santiago", 24, 3.7);

        // Muestro datos.
        System.out.println(e1);
        System.out.println("--------------------");
        System.out.println(e2);
        System.out.println("--------------------");

        // Comprobación de aprobados.
        if (e1.estaAprobado() && e2.estaAprobado()) {
            System.out.println("Los dos han aprobado satisfactoriamente.");
        } else if (e1.estaAprobado() && !e2.estaAprobado()) {
            System.out.println("Álvaro ha aprobado, pero Santiago ha suspendido.");
        } else if (!e1.estaAprobado() && e2.estaAprobado()) {
            System.out.println("Álvaro ha suspendido, pero Santiago ha aprobado.");
        } else {
            System.out.println("Los dos han suspendido. ¡Qué pena!");
        }
    }
}