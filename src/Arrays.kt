fun main()
{
    var numbers= arrayOf(1,2,3,4,5)
    val words:Array<String> =arrayOf("Kotlin","CPP","JAVA")
    var firstNumber = numbers[0]
    var secondNumber = numbers[1]
    println("First Number: $firstNumber")
    println("Second Number: $secondNumber")

    numbers[0]=10
    println(numbers[0])
    val squares=Array(5){i->i*i}
    println(squares[3])
    squares[3]=2
    println(squares[3])
    println()

    for (i in numbers){
        println(i)
    }
    println()

    var two_d = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
//    println(two_d[1][2]) //Element at row 1 and col 2
    for(i in two_d){
        for(j in i){
            println(j)
        }
    }
    println()
   //Create a 3*3 matrix and print it
    var three_three:Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    for (i in three_three){
        for (j in i){
            print("$j ")
        }
        println()
    }
    println()

    //Create a 3-d matrix
    val three_D: Array<Array<Array<Int>>> = arrayOf(
        arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9)),
        arrayOf(arrayOf(10, 11, 12), arrayOf(13, 14, 15), arrayOf(16, 17, 18)),
        arrayOf(arrayOf(19, 20, 21), arrayOf(22, 23, 24), arrayOf(25, 26, 27))
    )

    for (row in three_D) {
        for (arr in row) {
            for (num in arr) {
                print("$num ")
            }
            println(" ")
        }
        println("\n")
    }
}