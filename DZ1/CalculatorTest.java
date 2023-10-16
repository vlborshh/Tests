
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

/*        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }
        try {
            Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }*/
/*        assert 6 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');*/

/*        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        System.out.println(Calculator.squareRootExtraction(169));*/
        testCalculateDiscount();
    }

    public static void testCalculateDiscount() {
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1, 50))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect discount amount");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect discount amount");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 101))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Incorrect discount amount");
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90.0);
        assertThat(Calculator.calculatingDiscount(200, 20)).isEqualTo(160.0);
        assertThat(Calculator.calculatingDiscount(300, 50)).isEqualTo(150.0);
    }
}
