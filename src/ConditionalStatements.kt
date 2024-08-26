fun main(args:Array<String>){
    /*var temp=25
    if(temp>20){
        println("It's a warm day")
    }*/

    /*val age=18
    if(age>=18){
        println("You are eligible to vote")
    }
    else{
        println("you are not eligible to vote")
    }*/

    /*var score=101
    if(score>100 || score<0){
        println("Invalid Score")
    }
    else if(score>=90 && score<=100){
        println("Grade: A")
    }
    else if(score>=85 && score<90){
        println("Grade: B")
    }
    else if(score>=70 && score<85){
        println("Grade: C")
    }
    else{
        println("Grade: D")
    }*/

    /*var a=5;
    var b=8;
    var operator='/';
    if(operator == '+'){
        println("${a+b}")
    }
    else if(operator == '-'){
        println("${a-b}")
    }
    else if(operator == '*'){
        println("${a*b}")
    }
    else if(operator == '/'){
        if (b!=0){
        println("${a/b}")
        }
        else{
            println("Not divisible by zero")
        }
    }
    else if(operator == '%'){
        println("${a%b}")
    }
    else{
        println("Invalid Arithmetic Operator")
    }*/

    //in Operator and ..(rangeTo method)
    /*val age=20
    if(age < 13){
        println("Child")
    }
    else if(age in 13..19){
        println("Teenage")
    }
    else if(age in 20..64){
        println("Adult")
    }
    else{
        println("Senior")
    }*/

    //When as a Expression
    /*
        val result = when (expression){
            value1 ->result1
            value2 -> result2
            else -> default
        }
     */

    val dayOfWeek=6
    val dayName=when(dayOfWeek){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else->"Invalid day"
    }
    println("Day of the week: $dayName")

    //when as a statement
    var number=9
    when{
        number%2==0-> println("$number is even")
        number%2!=0-> println("$number is odd")
        else-> println("Invalid Number")
    }
}