package OOP


// Acces Modifiers
  // Private  public and    /// protected

// Overloading and Over
// Riding
//
open  class Calculator{
   open fun  addNumber( a:Int, b:Int):Int{
         return  a+b
    }
    open fun  subtractNumber( a:Int, b:Int):Int{
        return  a-b
    }
    open fun  dividNumber(a:Double,b:Double):Double{
        return  a/b
   }
    open fun  mulipltyNumber(a:Double,b:Double):Double{
        return  a*b
    }

    protected  fun remider(dividand:Double,divisor:Double): Double {
            return   dividand % divisor
    }
}


class ScinetificCalculator: Calculator() {
    override fun addNumber(a: Int, b: Int): Int {
        return super.addNumber(a, b)
    }

    override fun subtractNumber(a: Int, b: Int): Int {
        return super.subtractNumber(a, b)
    }

    override fun dividNumber(a: Double, b: Double): Double {
        return super.dividNumber(a, b)
    }

    override fun mulipltyNumber(a: Double, b: Double): Double {
        return super.mulipltyNumber(a, b)
    }

    fun sin0(angle:Double):Double{
        return Math.sin(angle)
    }

    fun cos0(angle:Double):Double{
        return Math.cos(angle)
    }
    fun  tan0(angle:Double):Double{
        return  Math.cos(angle)
    }
    fun   suqareRoot(number:Double):Double{
         return Math.sqrt(number)
    }
    fun  getReminder(dividand:Double,divisor:Double){
          remider(dividand,divisor)
    }

}



 open  class A {
     protected  fun  printMsg(){
         println("Printing Msg")
     }
     open  fun  publicFuntion(){
         println("Printing Msg")
     }
     private  fun  privateMethod(){
         println("Printing Msg")
     }


 }





fun main(){

    var obj = ScinetificCalculator()
    println (obj.dividNumber(2.0,3.0))
    println (obj.mulipltyNumber(2.0,8.0))
    println (obj.sin0(70.0,))
    println (obj.cos0(180.0,))




}
