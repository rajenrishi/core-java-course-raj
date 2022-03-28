package pkg17association;

class Employee {
	
  int id;
  String name;
  String dept;
  
  Employee(int id, String name, String dept) {
	  
    this.id = id;
    this.name = name;
    this.dept = dept;
    System.out.println("\nEmployee name is " + name);
    System.out.println("Employee Id is " + id);
    System.out.println("Employee belongs to the " + dept + " Department");
  }
}

//class Department {
//	
//  String deptName;
//  int noOfemployees;
//  Department(String name, int numberOfemployees) {
//    this.deptName = name;
//    this.noOfemployees = numberOfemployees;
//  }
//}


class University {
	
  String universityName;
  int noOfdepartments;
  
  University(String name, int departments) {
	  
    this.universityName = name;
    this.noOfdepartments = departments;
  }
}

public class JP02AggregationDemo {
	
  public static void main(String[] args) {
	  
    Employee e1 = new Employee(101, "Rishi", "Engineering");
    Employee e2 = new Employee(167, "Rohan", "Management");
    Employee e3 = new Employee(125, "Sneha", "Accounts");
    
    
//    Department dept = new Department("Engineering", 0);
    
    
  }
}