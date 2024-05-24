package JavaBasicPrg;

import java.util.Scanner;

public class Attribute {
	String color="black";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attribute a = new Attribute();
		a.color="white";
		Scanner a1 = new Scanner(System.in);
		System.out.println("enter the color");
		String colour =a1.next();
		System.out.println(colour);
		
		System.out.println(a.color);
		Employee emp2 = new Employee();
		emp2.eid=201;
		System.out.println(emp2.eid);

	}

}
