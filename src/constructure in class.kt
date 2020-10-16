fun main(){
     var studentname=student("sokheng")
    val list=liststudent("1","3")
}
open class student{
    var name:String=" "
    constructor( name: String){
        this.name=name
    }
}
class liststudent{
    var id:String=" "

    constructor( id:String,name: String) {
        this.id=id
        println("This my ID and Grande : ${id} and i want to tell you that my name is :")
    }
}