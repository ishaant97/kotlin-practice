fun celsiusToFahrenheit(temperature: Int): Int {
    val temp = (temperature * 9 / 5) + 32
    return temp
}

fun fahrenheitToCelsius(temperature: Int): Int {
    val temp = (temperature - 32) * 5 / 9
    return temp
}

fun main(args: Array<String>) {
    println(celsiusToFahrenheit(30))  
    println(fahrenheitToCelsius(55))  
    
}
