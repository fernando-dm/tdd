package math.fraction;

import static java.lang.Integer.max;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue) {
        this(integerValue,1);
//        this.numerator = integerValue;
//        this.denominator =1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction otherFraction) {
        int deno =0;
        Fraction fraction;

        if (  otherFraction.denominator !=0 &&
                ((otherFraction.denominator%this.denominator) ==0) ){
            deno = max(otherFraction.denominator, this.denominator);

            fraction = new Fraction((deno/this.denominator*this.numerator) +
                    otherFraction.numerator,deno);

        } else if(otherFraction.denominator !=0 && (otherFraction.denominator%this.denominator) !=0){
            deno = (otherFraction.denominator * this.denominator);
            fraction = new Fraction((deno/this.denominator*this.numerator) +
                    deno/otherFraction.denominator*otherFraction.numerator,deno);
        }
        else{
            fraction =  new Fraction(this.numerator +
                    otherFraction.numerator,denominator);
        }
        return fraction;
    }

    public int intValue() {
        return numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // con este metodo equals, sobreescribo el equals que usan los test
    @Override
    public boolean equals(Object other){
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }
    // con este metodo en el equals anterior le digo que la salida
    // del objeto Fraction sea String con este formato
    @Override
    public String toString(){
        return String.format("%d/%d",numerator,denominator);
    }
}
