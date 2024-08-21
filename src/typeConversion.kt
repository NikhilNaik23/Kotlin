fun main(args: Array<String>){
    val x:Int=100
    val y:Long=x.toLong()
    print(y)

    //Safe and Unsafe Cast
    var a="hi"
    var b:String=a as String
    println("unsafe casting result: $b")
//    var c:Int=a as Int
//    println("ClassCastException")

    var d:Int = a as? Int
    if (d!=null)



}