fun factorial(num: Int): Int {
    return if (num <= 1) {
        1
    } else {
        num * factorial(num - 1)
    }
}

fun main(args: Array<String>) {
    val result = factorial(5)
    println(result)  
}
