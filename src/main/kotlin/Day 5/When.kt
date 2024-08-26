package `Day 5`

fun main() {
    val dayOfWeek = 3
    val dayName = when(dayOfWeek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println("Day of the week : $dayName")
}