package JavaBasicPrg;

import java.util.Scanner;

public class SwitchPositvieAndNegative {

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =n1.nextInt();
		//boolean n1=true;
		int n=0;
		if(num>0) {
			n=1;
		}
		else if(num<0) {
			n=-1;
			
		}
		else {
			n=0;
		}
		switch(n) {
		case 1:
			System.out.println("number is positive ");
			break;
		case -1 :
			System.out.println("number is negative");
			break;
		case 0:
			System.out.println("Number is Zero");
			break;
			default:
				System.out.println("Invalid Input");
		
		}

	}

}
