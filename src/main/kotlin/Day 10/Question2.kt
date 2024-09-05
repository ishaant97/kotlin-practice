package `Day 10`

fun main() {
    print("Enter account balance : ")
    var accountBalance = Integer.parseInt(readLine())
    var a = true

    do{
        print("Enter the amount you want to withdraw from your bank account : ")
        var withdrawalAmount = Integer.parseInt(readLine())
        if(accountBalance < withdrawalAmount){
            println("You don't have sufficient balance")
        }
        else {
            accountBalance = accountBalance - withdrawalAmount
            println("$withdrawalAmount has been deducted from your account and your new balance is $accountBalance")
        }
        print("Enter 1 if you want to withdraw again from you account or 0 to exit : ")
        var temp = Integer.parseInt(readLine())
        if(temp == 1){
            a = true;
        }
        else{
            a = false
        }
    }while (a)
}