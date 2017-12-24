import java.lang.Integer.max

class Fraction{
    val integerValue: Int
    private var denominator=0 // una val no puede ser reasignada,
                             // var si (es mutable)

    constructor(integerValue: Int){
        this.integerValue = integerValue
    }

    constructor(integerValue: Int, denominator: Int){
        this.integerValue = integerValue
        this.denominator = denominator
    }

    fun plus(otherfraction: Fraction):Fraction{

        if ((otherfraction.denominator%this.denominator)==0){
            val deno = max(otherfraction.denominator,this.denominator)
            return (Fraction((this.integerValue*(deno/this.denominator))+
                    otherfraction.integerValue,deno))
        }

        return Fraction(this.integerValue +
                otherfraction.integerValue, denominator)
    }

    fun toIntValue():Int{
        return this.integerValue
    }

    fun getNumerator(): Int {
        return this.integerValue
    }

    fun getDenominator(): Int {
        return denominator
    }
}