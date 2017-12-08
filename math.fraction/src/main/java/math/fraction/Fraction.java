package math.fraction;

public class Fraction {
    private int integerValue;
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }
    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction otherFraction) {
        return new Fraction(this.integerValue +
                otherFraction.integerValue,denominator);
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return integerValue;
    }

    public int getDenominator() {
        return denominator;
    }
}
