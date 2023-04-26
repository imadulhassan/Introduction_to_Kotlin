package OOP
fun main(){
    val obj = Ali("ALI",100)
    println(obj.tellyourAge(23))
    println(obj.age)

}



abstract class Person{
    abstract var age:Int
    abstract fun displayName():String
    fun  tellyourAge(age:Int):String {
        return  "My age $age"
    }
}


class  Ali(val name:String, override var age: Int):Person(){

    override fun displayName(): String {
        return  " My name is $name"
    }


}
