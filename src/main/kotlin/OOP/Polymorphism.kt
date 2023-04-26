package OOP
fun main(){


     val obj:Shape = Circle(20.0)
     val rect:Shape = Rectangle(20.0,30.0)
     val sqr:Shape = Suqare(20.0)

     val array = arrayOf<Shape>(Circle(20.0),Rectangle(20.0,30.0),Suqare(20.0))

     calculateArea(array)



}

fun calculateArea( list:Array<Shape>){
     for (obj in list){
            println(obj.area())
     }
}


open class Shape {
     open fun area():Double{
         return  0.0
     }
}

class Circle(val radius: Double ): Shape() {
    override fun area(): Double {
        return    2 * 3.14  * radius
    }

}

class  Suqare (val side:Double):Shape() {
    override fun area(): Double {
        return  side* side
    }
}

class  Rectangle(val hieght:Double ,val width:Double) :Shape(){
    override fun area(): Double {
        return hieght * width
    }
}




