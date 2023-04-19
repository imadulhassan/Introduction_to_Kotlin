import java.util.*

fun binarySearch(arr:Array<Int>, value :Int) : Int{
     var left = 0
     var right = arr.size-1
     while (left<=right) {
         val mid = (left + right) / 2
         when {
             // Case 1
             value == arr[mid] -> return  mid
             // Case 2
             value<arr[mid] -> right= mid-1
             else -> left = mid+1
         }
     }
    return  -1

}

fun  main(){
    var array = arrayOf(3,11 ,6,34,8,35,22,44,65,77,90,102,300)
    var reader = Scanner(System.`in`)
    println("Enter the value  you want to find:")
    val value = reader.nextInt()
    array.sort()
    var result = binarySearch( array, value)
    if(result==-1){
        println("Value not found:")
    }else
        println("Index is $result")
}