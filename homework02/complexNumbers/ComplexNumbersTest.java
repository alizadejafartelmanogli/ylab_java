package homework02.complexNumbers;

public class ComplexNumbersTest {
    public static void main(String[] args) {
        ComplexNumbersImpl complexNumber = new ComplexNumbersImpl();
        ComplexNumbersImpl complexNumber01 = new ComplexNumbersImpl(14.5, 5);
        ComplexNumbersImpl complexNumber02 = new ComplexNumbersImpl(18, 8);
        System.out.println("Сумма: " + complexNumber.sum(complexNumber01, complexNumber02));
        System.out.println("Вычитание: " + complexNumber.sub(complexNumber01, complexNumber02));
        System.out.println("Умножение: " + complexNumber.mult(complexNumber01, complexNumber02));
        System.out.println("Модуль: " + complexNumber01.getModule());
        System.out.println();

        complexNumber01 = new ComplexNumbersImpl(14);
        complexNumber02 = new ComplexNumbersImpl(9);
        System.out.println("Сумма: " + complexNumber.sum(complexNumber01, complexNumber02));
        System.out.println("Вычитание: " + complexNumber.sub(complexNumber01, complexNumber02));
        System.out.println("Умножение: " + complexNumber.mult(complexNumber01, complexNumber02));
        System.out.println("Модуль: " + complexNumber01.getModule());
    }
}
