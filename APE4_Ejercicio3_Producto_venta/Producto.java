
public class Producto {

    // Atributos
    String nombre;
    double precio;
    int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo para reducir el stock
    public void reducirStock(int cantidad) {

        if (stock >= cantidad) {
            stock = stock - cantidad;
            System.out.println("Venta realizada correctamente.");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    // Metodo para mostrar el producto
    public void mostrarProducto() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
    }
}
