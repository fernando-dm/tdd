import math.fraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMathFraction {
    @Test
    public void zeroPlusZeroReturnZero(){
        Fraction sum = new Fraction(0).
                plus(new Fraction(0));
        assertEquals(0,sum.intValue());
    }

    @Test
    public void integerPlusZeroReturnInterger(){
        Fraction sum = new Fraction(3).
                plus(new Fraction(0));

        assertEquals(3,sum.intValue());
    }
    @Test
    public void zeroPlusIntegerReturnInteger(){
        Fraction sum = new Fraction(0).
                plus(new Fraction(3));
        assertEquals(3,sum.intValue());
    }

    @Test
    public void integerPlusIntegerReturnInteger(){
        Fraction sum = new Fraction(3).
                plus(new Fraction(4));
        assertEquals(7,sum.intValue());
    }

    @Test
    public void negativeIntegerPlusInteger(){
        Fraction sum = new Fraction(-3).
                plus(new Fraction(-2));
        assertEquals(-5,sum.intValue());
    }

    @Test
    public void sumNumeratorGivenSameDenominator(){
        Fraction sum = new Fraction(3,2).
                plus(new Fraction(1,2));
        assertEquals(4,sum.getNumerator());
        assertEquals(2,sum.getDenominator());
    }

    @Test
    public void sumNumeratorGivenDifferentMultipleDenominator(){
        Fraction sum = new Fraction(3,2).
                plus(new Fraction(6,4));
        assertEquals(12,sum.getNumerator());
        assertEquals(4,sum.getDenominator());
    }
    @Test
    public void sumNumeratorGivenDifferentNonMultipleDenominator(){
        Fraction sum = new Fraction(-3,5).
                plus(new Fraction(7,3));
        assertEquals(26,sum.getNumerator());
        assertEquals(15,sum.getDenominator());
    }
    @Test
    public void wholeNumberEqualSameFraction() {
        assertEquals(new Fraction(5,1),
                new Fraction(5));
    }
}
