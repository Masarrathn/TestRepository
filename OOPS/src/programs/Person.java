package programs;

    class Person1 {
	
	String name;
	int age;
	
	 public Person1(String name, int age) {
		 this.name = name;
		 this.age = age;
		 
	 }
	  public String getName() {
	  return name;
	  }
	  
	  public int getAge() {
	  return age;
	  }
 }
       public class Person {
	  
	   public static void main(String [] args) {
		  Person1 p1=new Person1("Jackson" , 20);
		  Person1 p2=new Person1("Emily" , 22);
		  System.out.println(p1.getName()+ " "   +p1.getAge());
		  System.out.println(p2.getName()+  " "  +p2.getAge());
		  
	   }
	  }
	   



