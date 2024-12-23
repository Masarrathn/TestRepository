package Exceptionhandling;

import java.util.ArrayDeque;

public class ArrayList {

	public static void main(String[] args) {
		
		ArrayDeque<String> name= new ArrayDeque();
		
		name.add("Peter");
		name.add("Geeta");
		name.add("Nita");
		name.add("Jack");
		name.add("India");
		name.add("Mumbai");
		
		System.out.println(name);
		//remove all elements
		name.clear();
		System.out.println(name);
	
		
		

	}

}
