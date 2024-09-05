package `Day 10`

fun main() {
    print("Enter the purchase amount of the costomer : ")
    val totalPurchaseAmount = Integer.parseInt(readLine())
    val customerMemberShip = true

    if(totalPurchaseAmount >= 1000){
        if(customerMemberShip){
            println("You have a 20% discount so final payable amount is ${totalPurchaseAmount - (totalPurchaseAmount*0.2)}")
        }
        else{
            println("You have a 10% discount so final payable amount is ${totalPurchaseAmount - (totalPurchaseAmount*0.1)}")
        }
    }
    else{
        println("You total purchase amount is less than 1000 so you are not eligible for discount")
    }

}