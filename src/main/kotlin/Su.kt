import OOP.getInternalMethod

fun runningSum(nums:IntArray):IntArray{
    var resultArray=IntArray(nums.size)
     var prefix=0
     nums.forEachIndexed { index, x ->
             prefix+=x
             resultArray[index]=prefix
     }
    return  resultArray
}


fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
    var occurance =0
//    var distant =0
//               arr.forEach {x->
//                  var count= arr.count { it==x }
//                  if(count<occurance){
//                          distant= x
//                  }else{
//                      occurance= count
//                  }
//               }

     arr.reduce { acc, i ->
         print("$acc $i")
         0
     }
     arr.forEach {
         println(it)
     }
 return 0
}

fun main(){
    var ara:IntArray= IntArray(5)
    ara[0]=5
    ara[1]=5
    ara[2]=4
     getInternalMethod()

//    runningSum(ara).forEach {
//         print( "$it ")
//    }
    print( findLeastNumOfUniqueInts(ara,3))

}