package Exceptionhandling;
import java.util.*;
import java.util.List;
import java.util.LinkedList;
public class ListToArray {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
         list.add("India");
         list.add("Chennai");
         list.add("Mumbai");
         list.add("Banglore");
         list.add("Delhi");
         String[] arr = new String[list.size()];
         for (int i = 0; i < list.size(); i++)
             arr[i] = list.get(i);
         for (String x : arr)
             System.out.print(x + " ");
	}

}
