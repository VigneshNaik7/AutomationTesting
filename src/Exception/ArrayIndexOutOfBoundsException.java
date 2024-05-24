package Exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the postion 0-4"); //if you want to get ArrayIndexOutOfBoundsException 
													//then you have to pass the value greater then the array index value
													//for exampel size of the array is 5 then give more then it
		try {
			
		int pos = sc.nextInt();
		System.out.println("Enter the value");
		int val = sc.nextInt();
		a[pos]= val;
		System.out.println("Array value in the stack is "+a[pos]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(" Index 5 out of bounds for length 5");
		}
		
		
		

	}

}
