package `Day 3`

fun main() {
    val twoDArray = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    for(i in twoDArray){
        for(j in i){
            print("$j ")
        }
        println()
    }
}