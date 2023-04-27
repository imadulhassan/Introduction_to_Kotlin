package OOP
//
//Implement a class hierarchy to represent different types of employees, such as full-time employees, part-time employees, and contractors. Each employee should have properties such as the name, hire date, and hourly rate.
//For full-time employees, the total pay should be calculated based on their fixed annual salary, with no consideration for the hours worked.
//For part-time employees, the total pay should be calculated based on the hourly rate and the hours worked, with overtime pay for hours worked beyond 40 hours per week (overtime rate is 1.5 times the hourly rate).
//For contractors, the total pay should be calculated based on the hourly rate and the hours worked, with an additional 10% fee on top of the total pay.
//

fun main() {

    val fullTimeEmployee = FullTimeEmployee("Alex", "20-12-2022", 100000.0)
    val partTimeEmployee = PartTimeEmployee("Alex", "20-12-2022", 10.0)
    val contractor = Contractor("Alex", "20-12-2022", 20.0)

    println(fullTimeEmployee.calculatePay(40.0))
    println(partTimeEmployee.calculatePay(50.0))
    println(contractor.calculatePay(30.0))

}

// Employee class - the base class for all types of employees
open class Employee(val name: String, val hireDate: String, val hourlyRate: Double){
    // Method to calculate the total pay based on the hours worked
    open fun calculatePay(hoursWorked: Double): Double {
        return hoursWorked * hourlyRate
     }
}

// FullTimeEmployee class - inherits from Employee and represents a full-time employee
class FullTimeEmployee(name: String, hireDate: String, val annualSalary: Double) :
    Employee(name, hireDate, 0.0) {
    // Override the calculatePay method to use the fixed annual salary instead of hourly rate
    override fun calculatePay(hoursWorked: Double): Double {
        return annualSalary/12
    }
}
// PartTimeEmployee class - inherits from Employee and represents a part-time employee
class PartTimeEmployee(name: String, hireDate: String, hourlyRate: Double) :
    Employee(name, hireDate, hourlyRate) {
    // Override the calculatePay method to consider overtime pay for hours worked beyond 40 hours per week
    override fun calculatePay(hoursWorked: Double): Double {
        val regularHours = if (hoursWorked > 40) 40.0 else hoursWorked
        val overtimeHours = if (hoursWorked > 40) hoursWorked - 40 else 0.0
        val regularPay = regularHours * hourlyRate
        val overtimePay = overtimeHours * hourlyRate * 1.5
        return regularPay + overtimePay
    }
}

// Contractor class - inherits from Employee and represents a contractor
class Contractor(name: String, hireDate: String, hourlyRate: Double) :
    Employee(name, hireDate, hourlyRate) {
    // Override the calculatePay method to include an additional 10% as a contractor fee
    override fun calculatePay(hoursWorked: Double): Double {
        return super.calculatePay(hoursWorked) * 1.1
    }
}
