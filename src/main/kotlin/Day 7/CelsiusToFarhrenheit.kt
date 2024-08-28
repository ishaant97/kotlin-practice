package `Day 7`

fun main() {
    val a = 50
    val result = celToFar(a)
//    val result = farTocel(a)
    println(result)
}

fun celToFar(a:Int):Int{
    val result = (a * (9/5)) + 32
    return result
}

fun farTocel(a:Int):Int{
    val result = ((5/9) * a) - 32
    return result
}

//HomeWork
//celToFar and farToCel
//factorial
//fibonacci series