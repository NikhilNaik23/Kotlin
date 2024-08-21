var greet="Good Morning"

fun greet1()
{
    greet="Good Evening"
}

fun main(args:Array<String>)
{
    var a = 40
    println(a)
//     var try = 20
//     print(20)

    var `try`=20
    println(`try`)
    `try`=30

    println(`try`)
    val pi=3.14
    println(pi)
//     pi=1.3

    var b:Int
    var c:Int
    b=30
    c=a+b
    println(a)
    println(b)
    println(c)

    var message="hello" //Local Variable
    println(message)

    println(greet)
    greet1()
    println(greet)
}
// print(message)
