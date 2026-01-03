package dominio;

public class Estudiante {

    // Atributos.
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor.
    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Getters y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Método para comprobar si está aprobado.
    public boolean estaAprobado() {
        return notaMedia >= 5;
    }

    // Método toString.
    @Override
    public String toString() {
        String estado = estaAprobado() ? "APROBADO" : "SUSPENSO";

        return "[Datos del estudiante]\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + " años\n"
                + "Nota media: " + notaMedia + "\n"
                + "Estado: " + estado;
    }
}