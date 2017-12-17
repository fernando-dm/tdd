//import kotlin.test.assertEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class TestFraction {

    @Test
    fun xxx() {
        val sum: Fraction = Fraction(3).plus(Fraction(3))
        println(sum.toInte())
        assertEquals(6,sum.toInte())
    }


}