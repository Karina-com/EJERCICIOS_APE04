
public class Main {

    public static void main(String[] args) {

        // Crear un producto
        Producto producto1 = new Producto(
            "Cuaderno",
            2.50,
            10
        );

        // Mostrar producto inicial
        System.out.println("===== PRODUCTO INICIAL =====");
        producto1.mostrarProducto();

        // Primera venta
        System.out.println("\n===== PRIMERA VENTA =====");

        Venta venta1 = new Venta(3);
        venta1.aplicar(producto1);

        // Mostrar producto actualizado
        System.out.println("\n===== STOCK ACTUALIZADO =====");
        producto1.mostrarProducto();

        // Segunda venta
        System.out.println("\n===== SEGUNDA VENTA =====");

        Venta venta2 = new Venta(15);
        venta2.aplicar(producto1);

        // Mostrar stock final
        System.out.println("\n===== STOCK FINAL =====");
        producto1.mostrarProducto();
    }
}
