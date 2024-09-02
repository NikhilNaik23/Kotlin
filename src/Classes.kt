/*
class Student{
    fun result(){
        println("Pending")
    }
}
fun main(){
    val s1=Student()
    s1.result()
}*/

//Constructors
// i) Secondary Constructor

/*class Person{
    var name:String
    var age:Int

    constructor(x:String,y:Int){
        this.name=x
        this.age=y
    }
    constructor(x:String){
        this.name=x
        this.age=0
    }
    constructor(){
        this.name="Rahul"
        this.age=32
    }
    fun intro(){
        println("My name is $name and age is $age")
    }
}*/

//ii) Primary Constructor

class Person(var name:String ,var age:Int){
    constructor():this("Rahul",50)
    constructor(x:String):this(){
        this.name=x
        this.age=0
    }
    fun intro(){
        println("My name is $name and age is $age")
    }
}

fun main(args:Array<String>)
{
    var a=Person("Riya",22)
    a.intro()
    var b=Person("Heena")
    b.intro()
    var c=Person()
    c.intro()


}
