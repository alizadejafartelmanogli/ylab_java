package homework02.complexNumbers;

public class ComplexNumbersImpl implements ComplexNumbersGenerator {
    private double a;
    private double b;

    public ComplexNumbersImpl() {
    }

    public ComplexNumbersImpl(double a) {
        this.a = a;
        this.b = 0;
    }

    public ComplexNumbersImpl(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public ComplexNumbersGenerator sum(ComplexNumbersGenerator complexNumber01, ComplexNumbersGenerator complexNumber02) {
        double a = complexNumber01.getA() + complexNumber02.getA();
        double b = complexNumber01.getB() + complexNumber02.getB();
        return new ComplexNumbersImpl(a, b);
    }

    @Override
    public ComplexNumbersGenerator sub(ComplexNumbersGenerator complexNumber01, ComplexNumbersGenerator complexNumber02) {
        double a = complexNumber01.getA() - complexNumber02.getA();
        double b = complexNumber01.getB() - complexNumber02.getB();
        return new ComplexNumbersImpl(a, b);
    }

    @Override
    public ComplexNumbersGenerator mult(ComplexNumbersGenerator complexNumber01, ComplexNumbersGenerator complexNumber02) {
        double a = complexNumber01.getA() * complexNumber02.getA() - complexNumber01.getB() * complexNumber02.getB();
        double b = complexNumber01.getA() * complexNumber02.getB() + complexNumber01.getB() * complexNumber02.getA();
        return new ComplexNumbersImpl(a, b);
    }

    @Override
    public double getModule() {
        return Math.sqrt(this.a * this.a + this.b * this.b);
    }

    @Override
    public String toString() {
        if (this.b < 0) {
            return this.a + this.b + "*i";
        } else if (this.b == 0) {
            return String.valueOf(this.a);
        }
        return this.a + "+" + this.b + "*i";
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getB() {
        return b;
    }
}
