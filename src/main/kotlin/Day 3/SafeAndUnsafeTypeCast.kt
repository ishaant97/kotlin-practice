package `Day 3`

fun main() {
    var a = "hello"
    var b : String = a as String
    println("Unsafe casting result : $b")
    val c : Int = a as? Int
    println("safe castng result : $c")
}