package oop

fun main() {

    val eStudent = EStudent()
    eStudent.id = 100
    eStudent.name = "Hello World"
    eStudent.gender = "Male"
    eStudent.printInfo()

    val eStudentObjectWithName = EStudent("Sopheak")
    eStudentObjectWithName.id = 1000
    eStudentObjectWithName.printInfo()


    val anotherEStudent = EStudent(eStudentObjectWithName)
    anotherEStudent.gender = "Male"
    anotherEStudent.printInfo()
}

open class BaseStudent {
    protected fun welcome() {

    }

    fun sayWelcome() {
        welcome()
    }
}

class EStudent : BaseStudent {
    var id: Int = 0
    var name: String = ""
    var gender: String = ""

    constructor() {
    }

    constructor(name: String) {
        this.name = name
    }

    constructor(estudent: EStudent) {
        this.id = estudent.id
        this.name = estudent.name
    }

    init {
        println("EStudent-Id: $id")
    }

    private fun getInfo(): String {
        return "Id: $id, Name: $name, Gender: $gender"
    }

    fun printInfo() {
        welcome()
        println("EStudent Info: ${getInfo()}")
    }
}

class Student(
        val id: Int = 1,
        val name: String = "",
        val gender: String = "F",
        val age: Int,
        val dob: String
) {

    fun printInfo() {

    }
}