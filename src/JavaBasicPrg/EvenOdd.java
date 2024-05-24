package JavaBasicPrg;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]) {
		
		Scanner N = new Scanner(System.in);
		System.out.println("Enter the number to check odd or even");
		float num = N.nextInt();
		
		if(num%2==0){
			System.out.println("even number");
		}
//		
		else {
			System.out.println("odd number");
		}
		// TODO Auto-generated method stub

	}

}
