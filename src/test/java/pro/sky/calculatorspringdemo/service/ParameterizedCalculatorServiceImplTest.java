package pro.sky.calculatorspringdemo.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatorspringdemo.CalculatorService;
import pro.sky.calculatorspringdemo.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ParameterizedCalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    void calculatePlus(Integer input1, Integer input2, String expectedMessage) {
        String result = out.calculatePlus(input1, input2);
        assertEquals(expectedMessage, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    void calculateMinus(Integer input1, Integer input2, String expectedMessage) {
        String result = out.calculateMinus(input1, input2);
        assertEquals(expectedMessage, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    void calculateMultiply(Integer input1, Integer input2, String expectedMessage) {
        String result = out.calculateMultiply(input1, input2);
        assertEquals(expectedMessage, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    void calculateDivide(Integer input1, Integer input2, String expectedMessage) {
        String result = out.calculateDivide(input1, input2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(1, 2, "3"),
                Arguments.of(5, 8, "13"),
                Arguments.of(58, 49, "107"),
                Arguments.of(27, 13, "40")
        );
    }

    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(5, 4, "1"),
                Arguments.of(18, 2, "16"),
                Arguments.of(59, 48, "11"),
                Arguments.of(27, 13, "14")
        );
    }

    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(10, 2, "20"),
                Arguments.of(7, 5, "35"),
                Arguments.of(1, 2, "2"),
                Arguments.of(5, 8, "40")
        );
    }

    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(10, 2, "5.0"),
                Arguments.of(21, 3, "7.0"),
                Arguments.of(2, 2, "1.0"),
                Arguments.of(45, 5, "9.0")
        );
    }
}