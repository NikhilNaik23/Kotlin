open class Rectangle(val a:Double,val b:Double){
    fun area():Double{
        return a*b
    }
    open fun display(){
        println("area of rectangle with dimensions $a and $b is ${area()}")
    }
}
class Square(side:Double):Rectangle(side,side){
    override fun display(){
        println("area of square with side $a is ${area()}")
    }
}
fun main()
{
    val myRectangle=Rectangle(10.0,5.0)
    myRectangle.display()
    var mySquare=Square(1.5)
    mySquare.display()
}
