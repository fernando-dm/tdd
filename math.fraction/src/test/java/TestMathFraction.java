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

}
