/*
fun functionName(parameters): ReturnType{
    // Function body
    return value
}
 */

fun greet(){
    println("Good Morning!")
}
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun main(args:Array<String>){
    println("Calling greet Function")
    greet()
    println("Bye")
    println(sum(2,3))
}
