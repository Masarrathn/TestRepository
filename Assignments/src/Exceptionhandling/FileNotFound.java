package Exceptionhandling;

import java.util.Scanner;
public class FileNotFound {

	public static void main(String[] args) {
		
		try {
			
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println(num); }
		
		catch(ArithmeticException e) {
			
			System.out.println();
		}
		finally {
			System.out.println("File not found");
		}
	}		

	}


