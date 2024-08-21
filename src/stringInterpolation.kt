fun main()
{
    var a=20
    var b=30
    println("The sum of $a and $b is ${a+b}")

    val letter:Char
    letter='A'
    println("$letter")
    println("\n")
    print("\t")
    println("\$")
    println("\\")
    println("""
Nikhil
Nikhil
Nikhil
Nikhil
Nikhil
    """)

    println("""
Nikhil
    Nikhil
        Nikhil
            Nikhil
                Nikhil
    """)

    print("\tNikhil\nNikhil\tNikhil\n\tNikhil\n")
    println("""
    Nikhil
Nikhil  Nikhil
    Nikhil
    """)

    var numbers= arrayOf(1,2,3,4,5)
    val words:Array<String> =arrayOf("Kotlin","CPP","JAVA")
    var firstNumber = numbers[0]
    var secondNumber = numbers[1]
    println("First Number: $firstNumber")
    println("Second Number: $secondNumber")
}