fun main() {
  //  var reader = Scanner(System.in)
     val tempCelsius =gettempCelsius()

     val tempFarhenheit= calculatetemp(25.0)


     println("temperature in Farhenheit: \$$tempFarhenheit")

}


fun gettempCelsius() : Double
{
  println("Enter temperature in celsius: ")
   return 25.0
}




fun calculatetemp(tempCelsius: Double): Double
{
    return  9/5 * tempCelsius+ 32
}