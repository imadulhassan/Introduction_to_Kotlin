import java.util.Scanner

fun main(){

//    1 +1/x+ 1/x^2  +  1/x^3 +

    var reader = Scanner(System.`in`)
    println("Enter value of x:")
     var x= reader.nextInt()
    println("Enter value of range:")
    var range= reader.nextInt()

    var sumOfSeries=0.0

    for(r in 1 .. range){
        val power  =        Math.pow(x.toDouble(), r.toDouble())
        sumOfSeries= sumOfSeries +  1/power
    }

    print(sumOfSeries)

}