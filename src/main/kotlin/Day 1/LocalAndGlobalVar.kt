package basics

// local variable
//fun main() {
//    var message = "hello"
//    print(message)
//}


//global variables
class LocalAndGlobalVar {
    var message = "Good morning!"
    fun display() {
        print(message)
    }
}

fun main() {
    val obj = LocalAndGlobalVar()
    obj.display()
}