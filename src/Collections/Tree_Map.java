package Collections;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<String, Integer> emp = new TreeMap<>();
		
		emp.put("vignesh", 10001);
		emp.put("nuthan", 10002);
		emp.put("sai", 10003);
		emp.put("shubhu", 10004);
		emp.put("vidya", 10005);
	
		System.out.println(emp); //Display the output in alphabetical order or ascending order 
		System.out.println();
		
		emp.replace("vidya", 20005);
		System.out.println(emp);
		
		System.out.println();
		Integer value = emp.get("nuthan");
		System.out.println(value);
		
		System.out.println(emp.hashCode());
		System.out.println(emp.isEmpty());
	}
	

}
