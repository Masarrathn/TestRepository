package Exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingError {

	public static void main(String[] args) {
		try {
			
		
		 int a=10;
		 int b=0;
		int div;
		 div=a/b;
		 System.out.println(div);
		}
		
		 catch(Exception e) {
			 System.out.println("Cannot divide by zero");
		 }
	}
}