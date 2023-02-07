import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    /*@Test
    public void shouldCalculateAddition() {
        assertEquals(calculator.calculatePolishNotation("10 2 3 -   +"), 9);

    }*/
    //Неиспользуемый код лучше удалять

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

/*В целом хороший, добротный код. Думаю, комментарии для каждого метода излишни, т.к. у тебя по сути и так видно по
сигнатуре метода, что он делает.
И второй момент - выходишь за пределы рекомендуемого количества символов в строке. В IDEA есть такая вертикальная
линия, за которую лучше не выходить. Если помнишь, в каком-то из спринтов у нас был материал про количество символов.
А так в целом всё хорошо :)
 */