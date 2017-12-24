package math.fraction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionRefactorTest {
    @Test
    public void zeroPlusZeroReturnZero(){
        assertEquals(new Fraction(0),new Fraction(0).
                plus(new Fraction(0)));
    }

    @Test
    public void integerPlusZeroReturnInterger(){
        assertEquals(new Fraction(3),new Fraction(3).
                plus(new Fraction(0)));
    }
    @Test
    public void zeroPlusIntegerReturnInteger(){
        assertEquals(new Fraction(3),new Fraction(0).
                plus(new Fraction(3)));
    }

    @Test
    public void integerPlusIntegerReturnInteger(){
        assertEquals(new Fraction(7),new Fraction(3).
                plus(new Fraction(4)));
    }

    @Test
    public void negativeIntegerPlusInteger(){
        assertEquals(new Fraction(-5),new Fraction(-3).
                plus(new Fraction(-2)));
    }

    @Test
    public void sumNumeratorGivenSameDenominator(){
        assertEquals(new Fraction(3,5),
                new Fraction(1,5).
                plus(new Fraction(2,5)));
    }

    @Test
    public void sumNumeratorGivenDifferentMultipleDenominator(){
        assertEquals(new Fraction(12,4),
                new Fraction(3,2).
                plus(new Fraction(6,4)));

    }
    @Test
    public void sumNumeratorGivenDifferentNonMultipleDenominator(){
        assertEquals(new Fraction(26,15),
                        new Fraction(-3,5).
                        plus(new Fraction(7,3)));
    }
    // ya no necesito llamar a los metodos, luego de
    // sobreescribir con equals
    @Test
    public void wholeNumberEqualSameFraction() {
        assertEquals(new Fraction(5,1),
                new Fraction(5));
    }
    @Test
    public void wholeNumberNotEqualToDifferentwholeNumber(){
//        System.out.println(num); //  6/1
        assertNotEquals(new Fraction(6),
                new Fraction(5));
    }

    // *********
    // *** Refactor con metodos
    public void checkAddsFractionsAsIntegers(int addend, int augend, int expected){
//        assertEquals(expected,new Fraction(addend).
                            // plus(new Fraction(augend)).intValue()); // comparo numeradores 5 y 5
        assertEquals(new Fraction(expected),
                new Fraction(addend).
                        plus(new Fraction(augend))); // comparo string 5/1 y 5/1
        }

    @Test
    public void REFACTORzeroPlusZeroReturnZero(){
        checkAddsFractionsAsIntegers(0,0,0);
    }

    @Test
    public void REFACTORintegerPlusZeroReturnInteger(){
        checkAddsFractionsAsIntegers(3,0,3);
    }

    @Test
    public void REFACTORzeroPlusIntegerReturnInteger(){
        checkAddsFractionsAsIntegers(0,3,3);
    }

}
