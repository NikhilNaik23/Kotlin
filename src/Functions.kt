/*
fun functionName(parameters): ReturnType{
    // Function body
    return value
}
 */

fun greet(){
    println("Good Morning!")
}
fun sum(a:Int,b:Int):Int{ //Without default arguments and return type
    return a+b
}
fun sum1(a:Int=10,b:Int=20){ //With default arguments
    val c=a+b
    println(c)
}


//Recursive Function
fun fact(a:Int):Int{
    return if(a<=1)1 else a*fact(a-1)
}
fun main(args:Array<String>){
    println("Calling greet Function")
    greet()
    println("Bye")
    println(sum(2,3))
    println(sum(10,20))
    //println(sum()) //Error:No value passed for parameter 'a'
    println()
    sum1(50,20)
    sum1()
    println("Factorial of 5 is ${fact(5)}")
}