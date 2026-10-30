
public class Prestamo {

    // Atributos
    Usuario usuario;
    Libro libro;

    // Constructor
    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    // Metodo para registrar el prestamo
    public void registrar() {

        System.out.println("Usuario: " + usuario.nombre);
        System.out.println("Libro: " + libro.titulo);

        if (libro.prestar()) {

            System.out.println("Prestamo realizado correctamente.");

        } else {

            System.out.println("El libro no esta disponible.");

        }
    }
}
