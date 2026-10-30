
public class Main {

    public static void main(String[] args) {

        // Crear dos cuentas
        Cuenta cuenta1 = new Cuenta("Ana", 500);
        Cuenta cuenta2 = new Cuenta("Pedro", 200);

        // Mostrar saldos iniciales
        System.out.println("===== SALDOS INICIALES =====");

        System.out.println("Titular: " + cuenta1.titular);
        System.out.println("Saldo: $" + cuenta1.saldo);

        System.out.println("Titular: " + cuenta2.titular);
        System.out.println("Saldo: $" + cuenta2.saldo);

        // Primera transferencia valida
        System.out.println("\n===== TRANSFERENCIA 1 =====");

        cuenta1.transferir(cuenta2, 100);

        // Mostrar saldos despues de transferir
        System.out.println("\n===== SALDOS ACTUALIZADOS =====");

        System.out.println("Ana: $" + cuenta1.saldo);
        System.out.println("Pedro: $" + cuenta2.saldo);

        // Segunda transferencia que falla
        System.out.println("\n===== TRANSFERENCIA 2 =====");

        cuenta1.transferir(cuenta2, 600);

        // Mostrar saldos finales
        System.out.println("\n===== SALDOS FINALES =====");

        System.out.println("Ana: $" + cuenta1.saldo);
        System.out.println("Pedro: $" + cuenta2.saldo);
    }
}
