import org.junit.Assert.assertEquals
import org.junit.Test

class TestFraction {

    @Test
    fun zeroPlusZeroReturnZero() {
        val sum: Fraction = Fraction(0).
                plus(Fraction(0))
        println(sum.toInte())
        assertEquals(0,sum.toInte())
    }


}