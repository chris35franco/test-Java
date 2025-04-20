import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaBancariaTest {

    @Test
    public void testDeposito() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetiroExitoso() {
        CuentaBancaria cuenta = new CuentaBancaria(200);
        boolean resultado = cuenta.retirar(100);
        assertTrue(resultado);
        assertEquals(100, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetiroFallido() {
        CuentaBancaria cuenta = new CuentaBancaria(50);
        boolean resultado = cuenta.retirar(100);
        assertFalse(resultado);
        assertEquals(50, cuenta.getSaldo(), 0.01);
    }
}