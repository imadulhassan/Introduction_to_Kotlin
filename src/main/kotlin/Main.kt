import java.util.*

 fun showMessage(message:String):Unit{
     println("your message is $message")
 }


fun calculator(x:Double,y:Double,
               fn:(Double,Double)->Double
): Double {
     return  fn(x,y)
}


fun main() {
    var k =10.0
    var l= 20.0

    var multiply = { a:Double,b:Double ->
        a*b
    }
    var addition = { a:Double,b:Double ->
        a+b
    }
    var  division= { a:Double,b:Double ->
        a/b
    }

    println("result of addition ${calculator(k,l,addition)}")
    println("result of multiplication  ${calculator(k,l,multiply)}")
    println("result of division ${calculator(k,l,division)}")


}














