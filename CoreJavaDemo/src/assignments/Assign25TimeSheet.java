/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 25
//Write a Java class named Employee. This class takes name, salary per 
//hour and timesheet object. These will be provided when creating object.
//Write one more class called TimeSheet. This class will take number 
//of hours worked while creating object.
//In Employee class write a method to calculate the salary by multiplying 
//timesheet number of hours by salary per hour.

class EmployeeTS {
	
	double dSalaryPerHour = 0.0;
	String empName;
	
	EmployeeTS(double sal, String name) {

		this.dSalaryPerHour = sal;
		this.empName = name;
	}
	
	public double calSalary(TimeSheet ts) {
		
		return ts.iDaysWorked * this.dSalaryPerHour;
	}
}

class TimeSheet {
	
	int iDaysWorked;
	
	public TimeSheet(int daysWorked) {

		this.iDaysWorked = daysWorked;
	}
}

public class Assign25TimeSheet {

	public static void main(String[] args) {
		
		double dSalary;
		int daysWorked = 13;
		TimeSheet ts = new TimeSheet(daysWorked);
		
		EmployeeTS empTs = new EmployeeTS(200, "Name");
		dSalary = empTs.calSalary(ts);
		System.out.println("Salary to be given to the employee: " + dSalary);
	}
}
