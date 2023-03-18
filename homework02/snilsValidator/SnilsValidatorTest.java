package homework02.snilsValidator;

public class SnilsValidatorTest {
    public static void main(String[] args) {
        System.out.println(new SnilsValidatorImpl().validate("54987159856"));
        System.out.println(new SnilsValidatorImpl().validate("81357363707"));
        System.out.println(new SnilsValidatorImpl().validate("17661923600"));
        System.out.println(new SnilsValidatorImpl().validate("99999999901"));
    }
}
