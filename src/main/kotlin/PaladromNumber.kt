fun main(){
    var n=0
    var num=62526  // user input
    var digit=0
    var rev=0
    n=num
    do {

      digit= num % 10     // digit=  6
      println("Digit $digit")
      rev= (rev *10 ) +digit   //  0 + 6  = 6
      println("Reverse $rev")
      num= num / 10  //  = 6252
      println("num $num")

    }while (num!=0)

    if(n==rev){
        println("Palindrome Number")
    }else{
        println(" Not Palindrome Number")
    }
}