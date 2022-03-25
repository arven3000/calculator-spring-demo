package pro.sky.calculatorspringdemo;

public interface CalculatorService {

    String calculate();

    String calculatePlus(int num1, int num2);

    String calculateMinus(int num1, int num2);

    String calculateMultiply(int num1, int num2);

    String calculateDivide(int num1, int num2) throws IllegalArgumentException;
}
