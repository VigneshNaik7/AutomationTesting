package JavaBasicPrg;

import java.util.Scanner;

public class PositiveOrNagativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =n.nextInt();
		if(num>0) {
			System.out.println(num+"...Positive integer");
			
		}
		else if(num<0) {
			System.out.println(num+"...Negative Integer");
		}
		else {
			System.out.println("Number is zero");
		}

	}

}
