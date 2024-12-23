package Exceptionhandling;

public class StringIndexOutofBound {

	public static void main(String[] args) {
		
		String st="Guvi Geek";
		
		try {
			
			char ch= st.charAt(9);
			
			System.out.println(ch);
		}
		
		catch (StringIndexOutOfBoundsException str) {
			
			System.out.println("String Index Out Of Bound");
			
		}

	}

}
