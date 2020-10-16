//fun main(){
//    println(getsum(1,2,3))
//}
//fun getsum( vararg  numbers:Int): Int {
//    var sum =9
//    for (number in numbers ) sum +=number
//    return sum
//}

//User defined function
//fun main (){
//    sum()
//}
// fun sum( ){
//     var num1=6
//    var num2=8
//     var num3=10
//     println("sum ="+(num1+num2+num3))
// }
// parameterize funcion
//fun main(){
//    val result=sum(1,2,3)
//    println(result)
//}
// fun sum (num1:Int,num2:Int,num3:Int): Int {
//     var add=num1 +num2+ num3
//     return add
// }
// fun main( ){
//    addnumber(2,3)
//}
//fun addnumber(a:Int,b:Int){
//    val aadd=a + b
//    println(aadd)
//}

//
//class myclass( val name:String,val id:Int){}
//fun main(){
//    val my=myclass("Sokheng",2)
//    println("name = ${my.name}\n ID =${ my.id}")
//}
class myClass(name: String, id: Int) {
    val e_name: String
    var e_id: Int

    init {
        e_name = name.capitalize()
        e_id = id

        println("Name = ${e_name}")
        println("Id = ${e_id}")
    }
}

fun main(args: Array<String>) {


    val iosDevs = arrayListOf<String>("Komsann")
//    printAllDevelopersInField("iOS", iosDevs)
    val iosDepartment = Department("iOS", iosDevs)
    // printAllMembersInDepartment(iosDepartment)

    val androidDevs = arrayListOf<String>("Sokheng", "Sopheak")
//    printAllDevelopersInField("Android", androidDevs)
    val androidDepartment = Department("Android", androidDevs)
    // printAllMembersInDepartment(androidDepartment)

    val frontEndDevs = arrayListOf<String>("Sophanna", "Thearith", "Sokchea", "Piseth")
//    printAllDevelopersInField("FrontEnd", frontEndDevs)
    val frontEndDepartment = Department("FrontEnd", frontEndDevs)
    frontEndDepartment.fieldTitle = "FrontEnd 123456"
    // printAllMembersInDepartment(frontEndDepartment)

    val backEndDevs = arrayListOf<String>("Sokna", "Mesa")
//    printAllDevelopersInField("BackEnd", backEndDevs)
    val backEndDepartment = Department("BackEnd", backEndDevs)
    // printAllMembersInDepartment(backEndDepartment)

    val uiUxDesigners = arrayListOf<String>("Theara")
//    printAllDevelopersInField("UX/UI", uiUxDesigners)
    val uiUXDepartment = Department("UI/UX", uiUxDesigners)
    // printAllMembersInDepartment(uiUXDepartment)

    printAllDepartmentsAndMembers(
            arrayListOf(iosDepartment, androidDepartment, frontEndDepartment, backEndDepartment, uiUXDepartment)
    )
}

fun printAllDevelopersInField(fieldTitle: String, devs: ArrayList<String>) {
    println("$fieldTitle Dep:")
    for (dev in devs) {
        println("Name: $dev")
    }
    println()
}

fun calculate(i: Int, i1: Int) {}

fun calculateAndOperate(numberA: Int, numberB: Int) {
    println("NumberA: $numberA, NumberB: $numberB")
}

fun calculateAndReturnNumbers(): Int {
    return 1
}

fun calculateSumOfTwoNumbers(numberA: Int, numberB: Int): Int {
    return numberA + numberB
}

fun printAllMembersInDepartment(department: Department) {
    println("${department.fieldTitle} Dep:")
    for (dev in department.developers) {
        println("Name: $dev")
    }
    println()
}

fun printAllDepartmentsAndMembers(departments: ArrayList<Department>) {
    for (department in departments) {
        // printAllMembersInDepartment(department)

        // printAllDevelopersInField(department.fieldTitle, department.developers)
        department.printDepartmentInfo()
    }
}


class Department(
        var fieldTitle: String,
        var developers: ArrayList<String>) {


    fun printDepartmentInfo() {
        println("$fieldTitle Dep:")
        for (dev in developers) {
            println("Name: $dev")
        }
        println()
    }
}