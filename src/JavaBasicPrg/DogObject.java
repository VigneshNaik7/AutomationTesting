package JavaBasicPrg;

import java.util.Scanner;

public class DogObject {
	String dname;
	String dcolor;
	int dage;
	
	void viewdog() {
		Scanner vd = new Scanner(System.in);
		System.out.println("Enter the dog name");
		dname=vd.next();
		System.out.println("Enter the dog color");
		dcolor=vd.next();
		System.out.println("Enter the dog age");
		dage=vd.nextInt();
		System.out.println("Dog name is:" +dname);
		System.out.println("Dog color is:" +dcolor);
		System.out.println("Dog age is:" +dage);


		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DogObject do1 = new DogObject();
			do1.viewdog();
	}

}
