package `Day 8`

class Person2(var name: String, var age: Int){
    constructor(x: String): this(){
        this.name = x
        this.age = 0
    }
    constructor(): this("rahul",50)
    fun intro(){
        println("My name is $name and age is $age")
    }
}

fun main() {
    var a = Person2("Riya", 22)
    a.intro()
    var b = Person2()
    b.intro()
    var c = Person2("Heena")
    c.intro()
}