fun main(args:Array<String>){
    val a = 10
    val b = 5
    //Arithmetic Operators
    val add=a+b
    println("The result of $a + $b = $add")
    val sub=a-b
    println("The result of $a - $b = $sub")
    println("The result of $a * $b = ${a*b}")
    println("The result of $a / $b = ${a/b}")
    println("The result of $a % $b = ${a%b}")
    println()

    //Relational Operators
    val isequal = a==b
    println("$a == $b: $isequal")
    println("$a > $b: ${a>b}")
    println("$a < $b: ${a<b}")
    println("$a != $b: ${a!=b}")
    println("$a >= $b: ${a>=b}")
    println("$a <= $b: ${a<=b}")
    println()

    //Logical Operators
    val isTrue = true
    val isFalse = false
    val result = isTrue && isFalse
    println("$isTrue && $isFalse : $result")
    println("$isTrue || $isFalse : ${isTrue||isFalse}")
    println("!($isTrue && $isTrue) : ${!(isTrue && isTrue)}")

    //Assignment Operators
    var num1=10
    var num2=20
    num1+=num2
    println("The value of num1 = ${num1}") //30
    num1-=num2
    println("The value of num1 = ${num1}") //10
    num1*=num2
    println("The value of num1 = ${num1}") //200
    num1/=num2
    println("The value of num1 = ${num1}") //10
    num1%=num2
    println("The value of num1 = ${num1}") //10
    println()
    //Unary Operators
    var m=10
    var n=5
    println("The value of ++m =${++m}")
    println("The value of m++ =${m++}")
    println("The value of m = ${m}")
    println("The value of --n =${--n}")
    println("The value of n-- =${n--}")
    println("The value of n = ${n}")
    println()
    //BitWise Operators


}