
public class Main {

    public static void main(String[] args) {

        // Crear dos usuarios
        Usuario usuario1 = new Usuario(
            "Ana",
            "1801234567"
        );

        Usuario usuario2 = new Usuario(
            "Pedro",
            "1809876543"
        );

        // Crear un libro disponible
        Libro libro1 = new Libro(
            "Programacion en Java",
            true
        );

        // Primer prestamo
        System.out.println("===== PRIMER PRESTAMO =====");

        Prestamo prestamo1 = new Prestamo(
            usuario1,
            libro1
        );

        prestamo1.registrar();

        // Segundo prestamo
        System.out.println("\n===== SEGUNDO PRESTAMO =====");

        Prestamo prestamo2 = new Prestamo(
            usuario2,
            libro1
        );

        prestamo2.registrar();

        // Estado final del libro
        System.out.println("\n===== ESTADO DEL LIBRO =====");

        System.out.println("Titulo: " + libro1.titulo);
        System.out.println("Disponible: " + libro1.disponible);
    }
}
