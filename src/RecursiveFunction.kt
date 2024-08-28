fun factorial(a:Long):Long{
    return if(a<=1)1 else a*factorial(a-1)
}
fun main(args:Array<String>){
    print("Enter a number: ")
    val num= readln().toLong()
    println("The Factorial of $num is ${factorial(num)}")
}