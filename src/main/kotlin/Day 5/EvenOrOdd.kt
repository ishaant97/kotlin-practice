package `Day 5`

fun main() {
    print("Enter the number to check weather the number is even or odd : ")
    val number = Integer.valueOf(readLine())
    when {
        number % 2 == 0 -> println("${number} is even")
        number % 2 != 0 -> println("${number} is odd")
        else -> println("Unexpected number")
    }
}