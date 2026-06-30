/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gestionbancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author angel
 */
public class CuentaBancariaTest {
    
    private CuentaBancaria cuenta;
    
    public CuentaBancariaTest() {
    }
    
    @BeforeEach
    public void setUp() {
        // Inicializamos un escenario base para todas las pruebas
        cuenta = new CuentaBancaria("Angel Gonzalez", 2000.0);
    }

    @Test
    public void testGetTitular() {
        assertEquals("Angel Gonzalez", cuenta.getTitular());
    }

    @Test
    public void testGetSaldo() {
        assertEquals(2000.0, cuenta.getSaldo());
    }

    @Test
    public void testSetTitular() {
        // Probamos cambiarlo a un nombre válido
        cuenta.setTitular("Juan Perez");
        assertEquals("Juan Perez", cuenta.getTitular());
    }

    @Test
    public void testDeposito() {
        // Depositamos 500 a los 2000 iniciales
        double resultado = cuenta.deposito(500.0);
        assertEquals(2500.0, resultado);
        assertEquals(2500.0, cuenta.getSaldo());
    }

    @Test
    public void testRetiro() {
        // Retiramos 400 de los 2000 iniciales
        double resultado = cuenta.retiro(400.0);
        assertEquals(1600.0, resultado);
        assertEquals(1600.0, cuenta.getSaldo());
    }

    @Test
    public void testMostrarSaldo() {
        // Como mostrarSaldo() es un método void (vacío), no devuelve nada que asertar.
        // Lo mandamos a llamar para asegurar que se ejecute sin levantar excepciones.
        assertDoesNotThrow(() -> cuenta.mostrarSaldo());
    }
    
}