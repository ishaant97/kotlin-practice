package `Day 8`

open class Reactangle(val a : Double, val b : Double){
    fun area(): Double{
        return a * b
    }
    open fun display(){
        println("Area of reactangle with dimensions $a * $b is ${area()}")
    }
}

class Square(side: Double): Reactangle(side, side){
    override fun display() {
        println("Area of square with side $a ia ${area()}")
    }
}

fun main(){
    val myReactangle = Reactangle(4.0, 5.0)
    myReactangle.display()
    val mySquare = Square(3.0)
    mySquare.display()
}