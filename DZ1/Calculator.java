
public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }
        return Math.sqrt(number);
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки

        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new IllegalArgumentException("Incorrect discount amount");
        }
        double resultAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
        return resultAmount; // Метод должен возвращать сумму покупки со скидкой
    }
}