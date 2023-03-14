package homework02.complexNumbers;

public interface ComplexNumbersGenerator {

    ComplexNumbersGenerator sum(ComplexNumbersGenerator complexNumber01, ComplexNumbersGenerator complexNumber02);

    ComplexNumbersGenerator sub(ComplexNumbersGenerator complexNumber01, ComplexNumbersGenerator complexNumber02);

    ComplexNumbersGenerator mult(ComplexNumbersGenerator complexNumber01, ComplexNumbersGenerator complexNumber02);

    double getModule();

    String toString();

    double getA();

    double getB();
}
