import java.util.Scanner

fun main(){
    var reader= Scanner(System.`in`)
    println("Enter the nth term ")
    var num = reader.nextInt()
    var firstNum= 0
    var secNum=1
    print("  0  \n  1")
    for  ( x   in 1..num){
        var next = firstNum+ secNum
        print("   $next")
        firstNum= secNum     //  1
        secNum= next    // 1
    }
}
