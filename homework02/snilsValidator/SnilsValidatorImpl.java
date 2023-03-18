package homework02.snilsValidator;

public class SnilsValidatorImpl implements SnilsValidator {

    @Override
    public boolean validate(String snils) {
        if (!snils.matches("\\d{11}")) {
            return false;
        }
        int sum = 0;
        for (int i = 0, k = 9; i < 9; i++, k--) {
            sum += Character.digit(snils.charAt(i), 10) * k;
        }
        int expectedControlCount = Integer.parseInt(snils.charAt(9) + "" + snils.charAt(10));
        if (sum < 100) {
            return sum == expectedControlCount;
        } else if (sum == 100) {
            return expectedControlCount == 0;
        } else {
            int actualControlSum = sum % 101;
            if (actualControlSum == 100) {
                return expectedControlCount == 0;
            } else {
                return expectedControlCount == actualControlSum;
            }
        }
    }
}
