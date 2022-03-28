

//Assignment: 21
//Write a Java class named Employee with attributes “age”, “name”, “salary”. 
//Add two methods => one method to increase the age of the Employee and another 
//to increase the salary of the employee by 30%.

class Employee {
	
	String empName;
	int empAge;
	long empSalary;
	
	Employee(String empName, int empAge, long empSalary) {
		
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public void updateEmpAge() {
		
		this.empAge = this.empAge + 1;
	}
	
	public void salIncrement(int percent) {
		
		long increSal = (this.empSalary * percent) / 100;
		this.empSalary = this.empSalary + increSal;
	}
	
	public void displayEmpDetails() {

		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee Age: " + this.empAge);
		System.out.println("Employee Salary: " + this.empSalary);		
	}
}

public class Assign21EmpSalaryProcess {

	public static void main(String[] args) {
		
		int perIn = 30;

		Employee empObj = new Employee("Manoj", 24, 10000);
		System.out.println("Employee Details before update>>>>>>>>>>>>>>>>>>>>>>>");
		empObj.displayEmpDetails();
		empObj.updateEmpAge();
		empObj.salIncrement(perIn);
		System.out.println("Employee Details after update>>>>>>>>>>>>>>>>>>>>>>>");
		empObj.displayEmpDetails();
	}
}
