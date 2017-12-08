package math.fraction;

import static java.lang.Integer.max;

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
        int deno =0;
        Fraction fraction;

        if (  otherFraction.denominator !=0 &&
                ((otherFraction.denominator%this.denominator) ==0) ){
            deno = max(otherFraction.denominator, this.denominator);

            fraction = new Fraction((deno/this.denominator*this.integerValue) +
                    otherFraction.integerValue,deno);

        } else if(otherFraction.denominator !=0 && (otherFraction.denominator%this.denominator) !=0){
            deno = (otherFraction.denominator * this.denominator);
            fraction = new Fraction((deno/this.denominator*this.integerValue) +
                    deno/otherFraction.denominator*otherFraction.integerValue,deno);
        }
        else{
            fraction =  new Fraction(this.integerValue +
                    otherFraction.integerValue,denominator);
        }

        return fraction;

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
