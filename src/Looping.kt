fun main(args:Array<String>)
{
    for (i in 1..5){ //5 is included
        println("$i")
    }
    println()
    for (i in 1 until 5){ //5 is excluded
        print("$i\n")
    }
    println()
    for (i in 5 downTo 1){
        print("$i\n")
    }
    println()
    for (i in 5 downTo 1 step 2){
        print("$i\n")
    }
    println()

    val fruits= listOf("Apple","Banana","Cherry","Mango")
    for (i in fruits){
        println("$i")
    }
    println()
    for (i in fruits.indices){
        println("Fruits at $i is ${fruits[i]}")
    }
    println()
    //While loop
    var i=5
    while (i>0){
        println("$i")
        i--
    }
    println()
    i=5
    do {
        println("$i")
        i--
    }while (i>5)
    println()
    i=5
    do {
        println("$i")
        i--
    }while (i>0)
    println()
    i=1
    do {
        println("$i")
        i++
    }while (i<=5)

}