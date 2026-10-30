
public class Libro {

    // Atributos
    String titulo;
    boolean disponible;

    // Constructor
    public Libro(String titulo, boolean disponible) {
        this.titulo = titulo;
        this.disponible = disponible;
    }

    // Metodo para prestar el libro
    public boolean prestar() {

        if (disponible) {

            disponible = false;
            return true;

        } else {

            return false;

        }
    }

    // Metodo para devolver el libro
    public void devolver() {

        disponible = true;

        System.out.println("El libro ha sido devuelto correctamente.");
    }
}
