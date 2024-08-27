package `Day 6`

fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")

    for(fruit in fruits){
        println("Fruit is : ${fruit}")
    }
    for(index in fruits.indices){
        println("Index is $index --> ${fruits[index]}")
    }
}