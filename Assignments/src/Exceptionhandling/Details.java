package Exceptionhandling;
import java.util.Map.Entry;
import java.util.*;

public class Details {
    public static void main(String[] args) {
      
        TreeMap<Integer, String> Details = new TreeMap<>();

        
        Details.put(101, "Alice");
        Details.put(102, "Charlie");
        Details.put(103, "David");
        Details.put(104, "Geeta");
        Details.put(105, "Mohan");

        System.out.println(Details);
        Set myset= Details.entrySet();
        System.out.println(myset);
        Iterator it= myset.iterator();
        
        while(it.hasNext()) {
        	
        	Map.Entry entry = (Entry) it.next();
        	System.out.println(entry.getValue());
        }
}
}