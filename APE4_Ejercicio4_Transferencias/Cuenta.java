
public class Cuenta {

    // Atributos
    String titular;
    double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo para transferir dinero
    public void transferir(Cuenta destino, double monto) {

        if (monto > 0 && saldo >= monto) {

            saldo = saldo - monto;

            destino.saldo = destino.saldo + monto;

            System.out.println("Transferencia realizada correctamente.");
            System.out.println("Se transfirieron: $" + monto);

        } else {

            System.out.println("Fondos insuficientes o monto no valido.");

        }
    }
}
