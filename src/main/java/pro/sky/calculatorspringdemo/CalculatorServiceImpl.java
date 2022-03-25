package pro.sky.calculatorspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculate() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatePlus(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    @Override
    public String calculateMinus(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    @Override
    public String calculateMultiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    @Override
    public String calculateDivide(int num1, int num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return String.valueOf((double) num1 / num2);
    }
}
