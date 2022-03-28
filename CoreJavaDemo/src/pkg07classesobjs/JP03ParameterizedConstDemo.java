package pkg07classesobjs;

class Employee {
	
	String empName;
	int empID;
	String empLocation;
	
	// <ClassName>()
	Employee(String eName, int eID, String eLocation) {
		this.empName = eName;
		this.empID = eID;
		this.empLocation = eLocation;
	}
	
	
	// <access specifier> <return type> <method name>
	public void display() {
		
		System.out.println("Employee name: " + empName);
		System.out.println("Employee ID: " + empID);
		System.out.println("Employee location: " + empLocation);

	}
}

public class JP03ParameterizedConstDemo {

	public static void main(String[] args) {
		
		Employee empObj1 = new Employee("Empl 1", 10001, "Bangalore");
		empObj1.display();
		
		Employee empObj2 = new Employee("Empl 2", 10002, "Pune");
		empObj2.display();
	}
}
