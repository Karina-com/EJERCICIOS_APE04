
public class Rectangulo {

    // Atributos
    double base;
    double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo para calcular el area
    public double calcularArea() {
        return base * altura;
    }

    // Metodo para calcular el perimetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Metodo para comprobar si es cuadrado
    public boolean esCuadrado() {
        return base == altura;
    }

    // Metodo para obtener la descripcion
    public String obtenerDescripcion() {
        return "Rectangulo de " + base + " x " + altura;
    }

    // Metodo para mostrar todos los resultados
    public void mostrar() {
        System.out.println("Descripcion: " + obtenerDescripcion());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Es cuadrado: " + esCuadrado());
    }
}
