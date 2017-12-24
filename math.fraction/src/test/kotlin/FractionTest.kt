import org.junit.Assert.assertEquals
import org.junit.Test

class TestFraction {

    @Test
    fun zeroPlusZeroReturnZero() {
        val sum: Fraction = Fraction(0).
                plus(Fraction(0))
        println(sum.toIntValue())
        assertEquals(0,sum.toIntValue())
    }
    @Test
    fun addIntPlusIntReturnSum(){
        val sum: Fraction = Fraction(3, 0).
                plus(Fraction(3, 0))
        assertEquals(6,sum.toIntValue())
    }
    @Test
    fun sumNumeratorGivenSameDenominator(){
        val sum: Fraction = Fraction(2,3).
                plus(Fraction(1,3))
        assertEquals(3,sum.getNumerator())
    }

    @Test
    fun sumNumeratorGivenDifferentMultipleDenominator(){
        val sum : Fraction = Fraction(3,2).
                plus(Fraction(6,4))
        assertEquals(12,sum.getNumerator())
        assertEquals(4,sum.getDenominator())
    }


}