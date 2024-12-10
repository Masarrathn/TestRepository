package programs;

public class Employee {
	
	 private int ID;
	 public String name;
	 private double Salary;
	 
	 public Employee(int ID, String name, double Salary)
	 {
		 this.ID = ID;
		 this.name = name;
		 this.Salary = Salary;}
		 
	 
    
	 public int getID() {
		return ID;
	}
    
	 public void setID(int iD) {
		ID = iD;
	}

     public String getname() {
		return name;
	}

     public void setname(String name) {
		this.name = name;
	}
     
      public double getSalary() {
		return Salary;
	}

    public void setSalary(double salary) {
		this.Salary = Salary;
	}

    
   public void raiseSalary(double percentage) {
    	Salary = Salary + Salary * percentage / 100;	
    }

   public void printEmployeeDetails() {
	    
	    System.out.println("ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + Salary);	
   }


   
	public static void main(String [] args) {
	}
	@Override
	public String toString() {
				return "Employee [ID=" + ID + ", name=" + name + ", "
						+ ", Salary=" + Salary + "]";
			}
			   
		
}

	
