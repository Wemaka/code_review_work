import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        //TODO inser your realisation in test-method add
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void dif() {
        //TODO inser your realisation in test-method dif
        assertEquals(4,calculator.dif(8,4));
    }

    @Test
    void div() {
        //TODO inser your realisation in test-method div
        assertEquals(1,calculator.div(2,2));
    }

    @Test
    void times() {
        //TODO inser your realisation in test-method times
        assertEquals(4,calculator.times(2,2));
    }

    @Test
    void solver() {
        //TODO inser your realisation in test-method solver
        assertEquals(30,calculator.solver(4,7,2,3));
    }
}