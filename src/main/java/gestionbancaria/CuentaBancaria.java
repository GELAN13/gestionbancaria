package gestionbancaria;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (!titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Cambio no realizado. Dato vacío o no válido");
        }
    }

    public double deposito(double monto) {
        if (monto >= 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar no es válido");
        }
        return saldo;
    }

    public double retiro(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Tu saldo es: " + saldo);
    }
}