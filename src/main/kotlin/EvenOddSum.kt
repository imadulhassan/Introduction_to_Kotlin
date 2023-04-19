import java.util.Scanner

fun main(){
    var reader= Scanner(System.`in`)
    println("Enter number:")
    var num = reader.nextInt()
    var evenSum=0
    var oddSum =0
    for (i   in 1..num){
        if(i%2==0){
            evenSum =evenSum+ i
            //Or   evenSum +=i
        }else{
            oddSum+=i
        }
    }
    println ( "EvenSum :$evenSum   OddSum: $oddSum")
}