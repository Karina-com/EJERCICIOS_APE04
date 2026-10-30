
public class Venta {

    // Atributo
    int cantidad;

    // Constructor
    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo para aplicar la venta
    public void aplicar(Producto producto) {

        if (producto.stock >= cantidad) {

            producto.reducirStock(cantidad);

            double total = cantidad * producto.precio;

            System.out.println("Cantidad comprada: " + cantidad);
            System.out.println("Total a pagar: $" + total);

        } else {

            producto.reducirStock(cantidad);

        }
    }
}
