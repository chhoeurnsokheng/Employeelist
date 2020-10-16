package oop

fun main () {
    val allemployee=EmployeePayroll()
    allemployee.employeename="Thida"
    allemployee.totalworkHoursofEmployee=34
    allemployee.id=5
    allemployee.EmployeePayrollInformation()

    val printall=EmployeePayroll()
    printall.id=5
    printall.totalworkHoursofEmployee=30
    printall.employeename= "Sokhey"
    printall.printEmployeePayrollInformation()
    calculate()
}

fun calculate() {
    var totalWorkHours=45
    var ratePerHour=34
    var sum= (totalWorkHours+ratePerHour).toDouble()
    println("printEmployeeSalary: $sum $")
}

class EmployeePayroll{var id:Int=1
    var totalworkHoursofEmployee:Int=2
    var employeename:String="Sokheng"

    fun EmployeePayrollInformation(): String {
        return " Id :$id, Name:$employeename , Totalhour:$totalworkHoursofEmployee"
    }
    fun printEmployeePayrollInformation(){
        println("Print All information of employee : ${EmployeePayrollInformation()}h")
    }


}
