package math.fraction;

public class Fraction {
    private int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(this.integerValue +
                fraction.integerValue);
    }

    public int intValue() {
        return integerValue;
    }
}
