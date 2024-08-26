package `Day 5`

//Create a calculator with if Else elseif and the operators will be all the arithmetic operators
fun main() {
    print("Enter the first number : ")
    var a = Integer.valueOf(readLine())
    print("Enter the second number : ")
    var b = Integer.valueOf(readLine())
    print("Enter the operation u want to perform : ")
    var c = readLine()
    if(c == "+") {
        println("a + b = ${a + b}")
    }
    else if(c == "-") {
        println("a - b = ${a - b}")
    }
    else if(c == "*"){
        println("a * b = ${a*b}")
    }
    else if(c == "/"){
        println("a / b = ${a/b}")
    }
    else if(c == "%"){
        println("a % b = ${a%b}")
    }
    else{
        println("Plese enter a valid operator")
    }
}