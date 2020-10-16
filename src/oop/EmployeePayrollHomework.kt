package oop

/**
 * - Create a class named `Employee`
 *      -> Fields: id, name, gender, position, ratePerHour
 *      -> Functions: printEmployeeInformation, printEmployeeSalary, printEmployeePosition
 *
 * - Create a class named `EmployeePayroll`
 *      -> Fields: id, totalWorkHoursOfEmployee, employee
 *      -> Functions:
 *          - printEmployeePayrollInformation (id, totalWorkHours, name of employee)
 *          - [private] calculateTotalSalary: totalWorkHours * ratePerHour
 *          - printEmployeeSalary: 100 * 2.25 = $225 --> `Total Salary: $225`
 *
 */

fun main() {
    var forEmployee = Employeelist()
    forEmployee.id = 1
    forEmployee.name = "Sokheng"
    forEmployee.gender = "F"
    forEmployee.ratePerHour = "24h"
    forEmployee.printEmployeeInformation()

    var employeesalary=Employeelist()
    employeesalary.salary=" $100 "
    employeesalary.Printsalary()
    var positionEmployee=Employeelist()
    positionEmployee.position="software Engineering"
    positionEmployee.printEmployeePosition()

    val obj=rateandhour()
    obj.printsalary()
}
class rateandhour{
     var WorkHours:Int=23
    var  ratePerHours=28
    var sum1=(WorkHours+ratePerHours).toDouble()
    fun printsalary(){
        println("Your WorkHours :$WorkHours \nYour RatePerHour :$ratePerHours")
        println(" There is your calculate salary per month :$sum1 $")
    }
}

class Employeelist() {
    var id: Int? = null
    var name: String = " "
    var gender: String = " "
    var position: String = " "
    var salary:String=" "
    var ratePerHour:String=""
    fun EmployeeInformation(): String {
        return " Id : $id , Name: $name ,Gender : $gender ,Position :$position,RatePerHour : ${ratePerHour}, salary: ${salary} "
    }

    fun printEmployeeInformation() {
        println("EmloyeeInformation : ${EmployeeInformation()}")
    }
    fun Printsalary(){
        println("your salary check here : ${EmployeeInformation()}")
    }
    fun printEmployeePosition(){
        println("PLease , check your position here: ${EmployeeInformation()}")
    }



}

