import java.util.Scanner

fun  linearSearch( arr:Array<Int>, value :Int) : Int{
       for (index in arr.indices){
            if(arr[index]==value){
                return  index
            }
       }
    return  -1
}

fun main(){
     var array = arrayOf(23,456,6,7,8,43,67,32,565,7,5,4)
     var reader = Scanner(System.`in`)
     println("Enter the value  you want to find:")
     val value = reader.nextInt()

     var  result =linearSearch(array,value)

     if(result==-1){
         println("Value is not in the array.")
     }else{
         println("Index of $value is $result")
     }
}
