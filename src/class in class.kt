import java.awt.Color

//fun main( ){
//    var dog =Dog("black","white")
//
//}
//
//open class Animals(var color:String=""){
//  init {
//      println("Animal color: $color")
//  }
//}
//class Dog(color: String,var breed:String="bluee") :Animals(color){
//        init {
//            println("The animal type:$breed,$color")
//        }
//}
fun main(){
    var color=colorofanimail("black")
    var animal= Animalname("dog" )


}
open class colorofanimail(var color:String=" "){
    init {
        println("This is the  first color of ${color} ")
    }
}
class Animalname( var name:String=""):colorofanimail(){
     init {
         println("This  the  name and color of Animal ${name},${color}")
     }
}
