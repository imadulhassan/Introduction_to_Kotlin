package OOP

// This class is  implemented to disucss the concetp of Setter and init method  in Class
class Car( val mynam:String) {
    var carname :String=mynam
    var model :Int=0
    var seats :Int=0

    var cc :String=""
    var mylength=0
    constructor() : this("s") {
        print("primary Constructor")
    }

    init {
        println("Init")
    }

    init {
        println("Init 2")
    }


    fun  setCarName(name:String){
         this.carname= name
       mynam
    }
    fun  setCarModel(model:Int){
        this.model= model
    }
    fun setCarSeats(seats:Int){
        this.seats= seats
    }
    fun setCarCc(cc:String){
        this.cc= cc
    }

}


fun main(){

    var obj= Car()

    obj.setCarName("LandCrusier")
    obj.setCarModel(2033)
    obj.setCarCc("4000cc")
    obj.setCarSeats(5)

    println(obj.carname)
    println(obj.cc)
    println(obj.model)
    println(obj.seats)


}