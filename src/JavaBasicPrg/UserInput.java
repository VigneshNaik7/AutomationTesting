package JavaBasicPrg;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner us = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=us.next();
		System.out.println("Enter the Age");
		int age=us.nextInt();
		System.out.println("Enter the Gender");
		char g = us.next().charAt(0);
		System.out.println("Enter the phone Number");
		long num= us.nextLong();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+g);
		System.out.println("PhoneNo : "+num);

		
	}

}
