package pro.sky.calculatorspringdemo;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculateHello() {
        return calculatorService.calculate();
    }

    @GetMapping("/plus")
    public String calculatePlus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.calculatePlus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculateMinus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.calculateMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.calculateMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calculateDivide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorService.calculateDivide(num1, num2);
    }

    @ExceptionHandler(value = {IllegalArgumentException.class, MissingServletRequestParameterException.class})
    public String handleException() {
        return "Передан некорректный параметр";
    }
}
