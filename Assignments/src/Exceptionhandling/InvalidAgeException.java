package Exceptionhandling;
import java.util.Scanner;

public class InvalidAgeException extends Exception {
	
		InvalidAgeException(String msg) {
		super(msg);
	}
	
	public static void main(String args[]) {

     Scanner sc= new Scanner(System.in);
     System.out.println("Enter you Age:");
     int age=sc.nextInt();
     
     try {
          checkAge(age);
     }
     catch(Exception e) {
    	 
    	 System.out.println("You are not eligible for voting.");
     } 
     }
     
     static void checkAge(int age) throws  InvalidAgeException {	
    	 if(age<18) {
    		 throw new InvalidAgeException("You are not eligible for voting.");
    	 }
    	 else {
    		 
    		 System.out.println("You are eligible for voting");
    	 }
     }
}