import math.fraction.Fraction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator(){
        assertEquals(new Fraction(3,5),
                new Fraction(3,5));
    }
    @Test
    public void differentNumeratorAndSameDenominator(){
        assertNotEquals(new Fraction(3,5),
                new Fraction(2,5));
    }

    @Test
    public void differentNumeratorsAndDenominators() {
        assertNotEquals(new Fraction(3,5),
                new Fraction(2,6));
    }

    @Test
    public void wholeNumberEqualSameFraction() {
        assertEquals(new Fraction(5,1),
                new Fraction(5));
    }

}

//java.lang.AssertionError:
//Expected :math.fraction.Fraction@deb6432
//Actual   :math.fraction.Fraction@28ba21f3
