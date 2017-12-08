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



}
