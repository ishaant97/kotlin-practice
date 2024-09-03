package `Day 9`

interface Shape{
    fun area():Double
}

open class Rectangle2(val a:Double, val b: Double): Shape{
    override fun area(): Double {
        return a*b
    }
    open fun display(){
        println("area of reactangle with dimensions $a * $b is ${area()}")
    }
}

class Square(side: Double): Rectangle2(side, side){
    override fun display() {
        println("area of square with side $a is ${area()}")
    }
}

fun main() {
    val myReactangle = Rectangle2(4.0,5.0)
    myReactangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}