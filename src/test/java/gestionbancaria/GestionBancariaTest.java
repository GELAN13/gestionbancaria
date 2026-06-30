package gestionbancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class GestionBancariaTest { // Si renombraste el archivo a CuentaBancariaTest, cambia este nombre aquí
    
    private CuentaBancaria cuenta;

    public GestionBancariaTest() { 
    }
    
    @BeforeEach
    public void setUp() {
        cuenta = new CuentaBancaria("Juan Perez", 1000.0);
    }

    @Test
    public void testGetTitular() {
        assertEquals("Juan Perez", cuenta.getTitular(), "El titular no coincide con el inicializado.");
    }

    @Test
    public void testGetSaldo() {
        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    public void testSetTitularValido() {
        cuenta.setTitular("Carlos Gomez");
        assertEquals("Carlos Gomez", cuenta.getTitular());
    }

    @Test
    public void testSetTitularInvalidoVacio() {
        cuenta.setTitular("");
        assertEquals("Juan Perez", cuenta.getTitular());
    }

    @Test
    public void testDepositoMontoValido() {
        double nuevoSaldo = cuenta.deposito(500.0);
        assertEquals(1500.0, nuevoSaldo);
        assertEquals(1500.0, cuenta.getSaldo());
    }

    @Test
    public void testDepositoMontoNegativo() {
        double nuevoSaldo = cuenta.deposito(-200.0);
        assertEquals(1000.0, nuevoSaldo);
        assertEquals(1000.0, cuenta.getSaldo());
    }

    @Test
    public void testRetiroMontoValido() {
        double nuevoSaldo = cuenta.retiro(300.0);
        assertEquals(700.0, nuevoSaldo);
        assertEquals(700.0, cuenta.getSaldo());
    }

    @Test
    public void testRetiroSaldoInsuficiente() {
        double nuevoSaldo = cuenta.retiro(2500.0);
        assertEquals(1000.0, nuevoSaldo);
        assertEquals(1000.0, cuenta.getSaldo());
    }
}