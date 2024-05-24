package ArrayPrg;

import java.util.Scanner;

public class UserArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = ar.nextInt();
		System.out.println("Enter the array element");
		int array[]=new int[10];
		for(int i=0;i<n;i++) {
			 array[i]=ar.nextInt();
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}

	}

}
