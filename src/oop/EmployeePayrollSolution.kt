package oop



fun main() {
    val firstEmployee = Employee(
            id = 10,
            name = "Sokheng",
            gender = "F",
            position = "IOs",
            ratePerHour = 2.5f
    )
    println("First Employee:")
    firstEmployee.printEmployeeInformation()

    println()
    firstEmployee.printEmployeePosition()

    println()
    firstEmployee.printEmployeeRatePerHour()


    println()
    println("Payroll for `firstEmployee`:")

    val firstEmployeePayroll = Payroll()
    firstEmployeePayroll.id = 822
    firstEmployeePayroll.totalWorkHours = 195.5f
    firstEmployeePayroll.employee = firstEmployee
    firstEmployeePayroll.printEmployeePayrollInformation()

    println()
    firstEmployeePayroll.printEmployeeSalary()
}

class Employee(
        val id: Int,
        val name: String,
        val gender: String,
        val position: String,
        val ratePerHour: Float
) {

    fun printEmployeeRatePerHour() {
        println("Rate per hour: $ratePerHour")
    }

    fun printEmployeePosition() {
        println("Position: $position")
    }

    fun printEmployeeInformation() {
        println("Id: $id\n" +
                "Name: $name\n" +
                "Gender: $gender\n" +
                "Position: $position\n" +
                "Rate Per Hour: $ratePerHour")
    }
}

class Payroll {
    var id: Int = 0
    var totalWorkHours: Float = 0f
    var employee: Employee? = null

    fun printEmployeePayrollInformation() {
        println("Payroll:\n" +
                "Id: $id\n" +
                "Total Work Hours: $totalWorkHours\n" +
                "Employee Id: ${employee?.id}\n" +
                "Employee Name: ${employee?.name}\n")
    }

    private fun calculateTotalSalary(): Float {
        return totalWorkHours * (employee?.ratePerHour ?: 0f)
    }

    fun printEmployeeSalary() {
        val salary = calculateTotalSalary()
        println("Total Work Hours: $totalWorkHours\n" +
                "Rate Per Hour: ${employee?.ratePerHour}\n" +
                "Total Salary: $salary")
    }
}

//class Payroll(
//        var id: Int,
//        var workHours: Float,
//        var employee: Employee
//) {
//
//}