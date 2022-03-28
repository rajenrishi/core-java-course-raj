/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 24
//Write a program to create a Employee class. Create a private variable to save 
//salary and public variable which takes the grade of employee.
//Salary & grade (A, B, C) will be passed during object initialization.
//Now write getter & setter method to get and update the salary of the employee.
//In setter method; if the employee belongs to grade A, increase the salary 
//by 15%; if grade B, increase by 10%; if grade C increase by 5%.
//In getter method; return the update salary.

class EmployeeSalInc {
	
	private double dSalary = 0.0;
	char sGrade;
	final float fGradeAInc = 15;
	final float fGradeBInc = 10;
	final float fGradeCInc = 5;
	
	EmployeeSalInc(double sal, char grade) {

		this.dSalary = sal;
		this.sGrade = grade;
	}
	
	public void setSalary() {
		
		switch(sGrade) {
		
			case 'A': this.dSalary = this.dSalary + ((this.dSalary * fGradeAInc)/100);
					break;
					
			case 'B': this.dSalary = this.dSalary + ((this.dSalary * fGradeBInc)/100);
					break;
					
			case 'C': this.dSalary = this.dSalary + ((this.dSalary * fGradeCInc)/100);
					break;
		
			default: System.out.println("Invalid grade is given.");
		
		}
	}
	
	public double getSalary() {
		
		return dSalary;
	}
}

public class Assign24EmpSalIncrement {

	public static void main(String[] args) {
		
		double dNewSalary;

		EmployeeSalInc emp1 = new EmployeeSalInc(2000, 'A');
		emp1.setSalary();
		dNewSalary = emp1.getSalary();
		System.out.println("New salary of employee with grade A: " + dNewSalary);
		
		EmployeeSalInc emp2 = new EmployeeSalInc(2000, 'B');
		emp2.setSalary();
		dNewSalary = emp2.getSalary();
		System.out.println("New salary of employee with grade B: " + dNewSalary);
		
		EmployeeSalInc emp3 = new EmployeeSalInc(2000, 'C');
		emp3.setSalary();
		dNewSalary = emp3.getSalary();
		System.out.println("New salary of employee with grade C: " + dNewSalary);
		
	}
}
