package OOP

open class Phone(var name: String, var  type:String){
    constructor(name : String,type: String,model:String) : this(name,type) {
        println("Secoundry Constructor ")
    }

    fun makeACall(){
         println("Make a Call ")
    }
    fun sendSms(){
      println("Send Sms")
    }
}

open class SmartPhone( name: String,  type: String) : Phone(name,type){
   open fun  takePicture (){
        println("Take Picture ")
    }
   open fun  RecordVideo (){
        println("RecordVideo Picture ")
    }
}
class  Samsung( name: String, type: String):SmartPhone(name,type){
    override fun RecordVideo() {
       super.RecordVideo()
        println("Adding AR Emoji in video")
    }
    override fun takePicture() {
        println("Adding Filter in picture ")
    }


}




fun main(){
    var phone =Phone("Samsum","Normal","2023")

    var obj= SmartPhone("Smart","Normal")
    obj.makeACall()
    obj.RecordVideo()
    obj.sendSms()
    obj.takePicture()

    var samsung = Samsung("Samsum","Type")
    samsung.RecordVideo()
    samsung.takePicture()

    getMsg()
    getInternalMethod()

}





