/*
fun main(args:Array<String>){
    println("Enter the amount of purchase: ")
    var purchaseAmount=Integer.valueOf(readln())
    if (purchaseAmount>=1000){
        println("Do you have a membership (yes/no): ")
        val memberShip:String = readln()
        if (memberShip=="yes" ){
            println("you are eligible for 20% discount")
        }
        else{
            println("you are eligible for 10% discount")
        }
    }
    else{
        println("no discount available")
    }

}
*/

fun main(args:Array<String>)
{
    var balance=1000
    var toWithdraw = true
    while (toWithdraw){
        println("Enter an amount to withdraw: ")
        var amount=Integer.valueOf(readln())
        if(amount > balance){
            println("Insufficient balance")
        }
        else{
            balance -= amount
        }
        println("Remaining Balance: $balance")
        println("want to make another withdrawal(yes/no): ")
        var a =readln()
        if(a == "yes"){
            toWithdraw = true
        }
        else{
            toWithdraw = false
        }
    }

    println("Thank you")
}