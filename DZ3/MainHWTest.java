package DZ3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    @ParameterizedTest
    @ValueSource(ints = { 0, 2, -4 })
    public void testEvenNumber(int number) {
        MainHW mainHW = new MainHW();
        boolean result = mainHW.evenNumber(number);
        assertTrue(result, number + " должно считаться четным.");
    }

    @ParameterizedTest
    @ValueSource(ints = { 9, -5 })
    public void testOddNumber(int number) {
        MainHW mainHW = new MainHW();
        boolean result = mainHW.evenNumber(number);
        assertFalse(result, number + " должно считаться нечетным.");
    }

    @ParameterizedTest
    @ValueSource(ints = { 26, 66, 99 })
    public void testNumberInIntervalTrue(int number) {
        MainHW mainHW = new MainHW();
        boolean result = mainHW.numberInInterval(number);
        assertTrue(result, "Число " + number + " должно попадать в интервал (25;100).");
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, 24, 101 })
    public void testNumberInIntervalFalse(int number) {
        MainHW mainHW = new MainHW();
        boolean result = mainHW.numberInInterval(number);
        assertFalse(result, "Число " + number + " не должно попадать в интервал (25;100).");
    }
}
