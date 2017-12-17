class Fraction(internal var integerVal: Int) {
    private var denominator = 1
    //    private val integerVal = integerValue

    constructor(integerVa: Int, denominator: Int) : this(integerVa) {
        this.integerVal = integerVa
        this.denominator = denominator
    }


    fun plus(otherFraction: Fraction): Fraction {
        return Fraction(this.integerVal + otherFraction.integerVal)
    }
    fun toInte(): Int {
        return integerVal
    }

}