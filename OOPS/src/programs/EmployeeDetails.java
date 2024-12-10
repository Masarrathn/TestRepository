package programs;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1001, "Emily Jackson", 20000);
		Employee emp2= new Employee(1002,"Rachel Harris",25000);
	    Employee emp3= new Employee(1003,"River Ben",30000);
	     
	     System.out.println("EmployeeDetails");
	     emp1.printEmployeeDetails();
	     emp2.printEmployeeDetails();
	     emp3.printEmployeeDetails();
	     
	   	
		 emp1.raiseSalary(8);
		 emp2.raiseSalary(10);
		 emp3.raiseSalary(12);
		 
		 System.out.println("\n After raisingSalary");
		 System.out.println("\n8% for 'Emily Jackson':");
		 emp1.printEmployeeDetails();
		 System.out.println("\n10% for 'Rachel Harris':");
		 emp2.printEmployeeDetails();
		 System.out.println("\\n12% for 'River Ben':");
		 emp3.printEmployeeDetails();
	}

	
	}
	     
	    
	
	    

