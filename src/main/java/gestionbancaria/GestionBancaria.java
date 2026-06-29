package gestionbancaria;

public class GestionBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Angel", 1000);

        System.out.println("Titular: " + cuenta.getTitular());

        cuenta.mostrarSaldo();

        System.out.println("\nDepositando $500...");
        cuenta.deposito(500);
        cuenta.mostrarSaldo();

        System.out.println("\nRetirando $300...");
        cuenta.retiro(300);
        cuenta.mostrarSaldo();

        System.out.println("\nIntentando retirar $2000...");
        cuenta.retiro(2000);
        cuenta.mostrarSaldo();

    }
}