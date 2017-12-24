package math.fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

// clase para testear los equals
// una vez que funcione la paso a la clase de test original
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

    @Test
    public void wholeNumberNotEqualToDifferentwholeNumber(){
        assertNotEquals(new Fraction(6),
                new Fraction(5));
    }
}

//java.lang.AssertionError:
//Expected :Fraction@deb6432
//Actual   :Fraction@28ba21f3
