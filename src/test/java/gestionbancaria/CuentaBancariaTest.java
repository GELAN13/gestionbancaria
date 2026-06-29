package gestionbancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    public void pruebaDeposito() {
        CuentaBancaria cuenta = new CuentaBancaria("Angel", 1000);
        cuenta.deposito(500);
        assertEquals(1500, cuenta.getSaldo());
    }

    @Test
    public void pruebaRetiro() {
        CuentaBancaria cuenta = new CuentaBancaria("Angel", 1000);
        cuenta.retiro(300);
        assertEquals(700, cuenta.getSaldo());
    }

    @Test
    public void pruebaRetiroSaldoInsuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria("Angel", 1000);
        cuenta.retiro(2000);
        assertEquals(1000, cuenta.getSaldo());
    }
}