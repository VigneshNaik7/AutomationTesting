package Collections;

import java.util.Collection;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> names = new LinkedList<String>();
		
		names.add("vignesh");
		names.add("nuthan");
		names.add("sai");
		names.add("shubhu");
		names.add("sunil");
		
		names.remove("shubhu");
		
		for(String i:names) {
			System.out.println(i);
		}

	}

}
