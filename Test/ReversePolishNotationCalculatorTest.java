import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    /*@Test
    public void shouldCalculateAddition() {
        assertEquals(calculator.calculatePolishNotation("10 2 3 -   +"), 9);

    }*/

    // Проверка операции сложения
    @Test
    void shouldCalculateAddition() {
        assertEquals(calculator.calculatePolishNotation("1 2 3 + +"), 6);
    }

    // Проверка операции вычитания
    @Test
    void shouldCalculateSubstraction() {
        assertEquals(calculator.calculatePolishNotation("20 10 3 - -"), 13);
    }

    // Проверка операции умножения
    @Test
    void shouldCalculateMultiplication() {
        assertEquals(calculator.calculatePolishNotation("2 3 4 * *"), 24);
    }

    // Проверка корректности работы при наличии в выражении различного количества пробелов
    @Test
    void shouldCalculateWithSpaces() {
        assertEquals(calculator.calculatePolishNotation("1 2    3 +       +"), 6);
    }

    // Проверка корректности работы при наличии в выражении отрицательных чисел
    @Test
    void shouldCalculateWithNegatives() {
        assertEquals(calculator.calculatePolishNotation("-20 10 3 - -"), -27);
    }
}