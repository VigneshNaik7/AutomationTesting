package Exception;

import java.util.Scanner;

public class HandelArithmeticExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int div;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		num = sc.nextInt();
		
		try {
			System.out.println(100/num);
		}
		catch(ArithmeticException e) { //We can give only exceptions also instade of ArithmeticException because 
											//ArithmeticException is a child class of Exception class (Exception is parent class)
			System.out.println("Invalid data ");
		}
		System.out.println("Program is complted");
		System.out.println("Exit");
		
		

	}

}
