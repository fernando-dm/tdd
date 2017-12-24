class Fraction{

    private var integerValue: Int

    constructor(integerValue: Int){
     this.integerValue = integerValue
    }
    fun plus(otherfraction: Fraction):Fraction{
        return Fraction(this.integerValue +
                otherfraction.integerValue)
    }
    fun toInte():Int{
        return this.integerValue
    }
}