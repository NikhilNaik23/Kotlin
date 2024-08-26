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

    val age=20
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
    }
}