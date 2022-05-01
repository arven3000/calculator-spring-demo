package pro.sky.calculatorspringdemo.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorspringdemo.CalculatorService;
import pro.sky.calculatorspringdemo.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    void calculate() {
        String result = out.calculate();
        assertEquals("Добро пожаловать в калькулятор", result);
        assertNotEquals("", result);
    }

    @Test
    void calculatePlusTest() {
        String result = out.calculatePlus(1, 2);
        assertEquals("3", result);
        assertNotEquals("0", result);

        result = out.calculatePlus(59, 48);
        assertEquals("107", result);
        assertNotEquals("10", result);

    }

    @Test
    void calculateMinusTest() {
        String result = out.calculateMinus(5, 2);
        assertEquals("3", result);
        assertNotEquals("0", result);

        result = out.calculateMinus(59, 48);
        assertEquals("11", result);
        assertNotEquals("5", result);
    }

    @Test
    void calculateMultiplyTest() {
        String result = out.calculateMultiply(5, 2);
        assertEquals("10", result);
        assertNotEquals("0", result);

        result = out.calculateMultiply(8, 5);
        assertEquals("40", result);
        assertNotEquals("42", result);
    }

    @Test
    void calculateDivideTest() {
        String result = out.calculateDivide(5, 2);
        assertEquals("2.5", result);
        assertNotEquals("0", result);

        result = out.calculateDivide(35, 5);
        assertEquals("7.0", result);
        assertNotEquals("6.0", result);
    }

    @Test
    void calculateDivideTestWithException() {
        assertThrows(IllegalArgumentException.class, () -> out.calculateDivide(2, 0));
    }
}