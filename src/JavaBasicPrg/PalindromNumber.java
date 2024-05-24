package JavaBasicPrg;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0,rem;
		System.out.println("enter the number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int num=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(num==rev) {
			System.out.println("Palindrome "); 
		}
		else {
			System.out.println("Not Palindrome ");
		}
		

	}

}
