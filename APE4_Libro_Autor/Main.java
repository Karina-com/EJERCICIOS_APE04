public class Main {

    public static void main(String[] args) {

        // Crear los autores
        Autor autor1 = new Autor(
            "Gabriel Garcia Marquez",
            "Colombiana"
        );

        Autor autor2 = new Autor(
            "Miguel de Cervantes",
            "Española"
        );

        // Crear los libros
        Libro libro1 = new Libro(
            "Cien años de soledad",
            1967,
            autor1
        );

        Libro libro2 = new Libro(
            "Don Quijote de la Mancha",
            1605,
            autor2
        );

        // Mostrar la informacion
        System.out.println("===== LIBRO 1 =====");
        libro1.mostrarInformacion();

        System.out.println();

        System.out.println("===== LIBRO 2 =====");
        libro2.mostrarInformacion();
    }
}