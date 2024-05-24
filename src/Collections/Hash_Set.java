package Collections;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> name = new HashSet<String>();
		
		name.add("vignesh");
		name.add("nuthan");
		name.add("sai");
		name.add("shubhu");
		name.add("prajju");
		name.add("sai"); //Set does not allow the dublicate value
		
		System.out.println(name);
		
		System.out.println(name.equals(name));
		System.out.println(name.getClass());
	}

}
