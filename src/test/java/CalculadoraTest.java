import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(5, 6);
        assertEquals(11, resultado);
        
    }
}