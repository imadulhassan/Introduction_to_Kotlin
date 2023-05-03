package OOP
fun main(){
//    val array = arrayOf<Shape>(Circle(20.0),Rectangle(20.0,30.0),Suqare(20.0))
//    calculateArea(array)
//

    var obj = Shape()
    obj.displayMessage()


}


fun calculateArea( list:Array<Shape>){
    for (obj in list){
        println(obj.area())
    }
}

interface  Draggable {
    fun dragable()
    fun displayMessage(){
         println("Dragable Message")
    }
}

interface  Hold {
     fun  hold()

     fun displayMessage(){
         println("Holding Messahe")
     }
}


open class Shape :Draggable,Hold{


    override fun dragable() {
       println("Draagable")

    }

    override fun displayMessage() {
         super<Hold>.displayMessage()


    }

    open fun area():Double{
        return  0.0
    }

    override fun hold() {
       println("Holding the shape")
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




