package OOP


class  TopLevel {   //

     class NestedClass {
          var name ="Nested Class"

          fun displayName(){
              println("name is $name")
          }
     }
}
class OuterClass {
     var name ="Outer Class "
      inner class InnerClass {
        var name ="Nested Class"

        fun displayName(){
            println("name is $name")
        }
     }
}


data class  PersonData(val name:String ,val phone:String,val age:Int)


object  DatabaseConnection {

     var dbName = "Kotlin.sql"
     var dbModel= "Private"
     fun getMyDbName():String{
          return dbName
     }

}


class School {
//
//    companion object{
//         var  schoolName=" GMHS"
//
//         fun getSchoolName(): String{
//               return  schoolName
//         }
//
//    }
//
//    fun  getNumberOfStudent():Int{
//        return 100
//    }


}



fun main(){
      // Object
      var obj= School()

//      School.schoolName
//      School.getSchoolName()
//    //Normal Function
//      obj.getNumberOfStudent()

}


//
//     var nestedObj = TopLevel.NestedClass()
//
//
//    var outerClassObj = OuterClass()
//    var innerClassObject = outerClassObj.InnerClass()
//    innerClassObject.displayName()

//      var obj = PersonData("IMAD","34567890",33)
//
//    val (name ,phone , age) = obj
//
//     println(name)
//     println(phone)
//     println(age)