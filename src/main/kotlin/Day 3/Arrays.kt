package `Day 3`

fun main() {
    val squares = Array(5) {i -> i*i}
    val firstNumber = squares[0]
    val secondNumber = squares[1]
    println("first number is : $firstNumber")
    println("second number is : $secondNumber")
//    modifiying the array values
    squares[0] = 10
    val changedNumber = squares[0]
    println("number after chaning is : $changedNumber")
    for(num in squares){
        println(num)
    }
}