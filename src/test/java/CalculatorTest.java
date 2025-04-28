import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void dif() {
        assertEquals(4,calculator.dif(8,4));
    }

    @Test
    void div() {
        assertEquals(1,calculator.div(2,2));
    }

    @Test
    void times() {
        assertEquals(4,calculator.times(2,2));
    }

    @Test
    void solver() {
        assertEquals(6,calculator.solver(2,2,2));
    }
}