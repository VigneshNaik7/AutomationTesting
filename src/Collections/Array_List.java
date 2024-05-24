package Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = new ArrayList<>(); //instade of list we can use Collection also
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		num.remove(0); //it will delete the index value
						//if we use the collection it will delete the element we mention in the remove method
		
		for(Integer i: num) {
			System.out.println(i);
		}
		

	}

}
