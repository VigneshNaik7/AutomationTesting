package JavaBasicPrg;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1,n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			f=f*i;
//			while(i<=n){
//				f=f*i;
//				i++;
				
		}
		System.out.println("Factorial of "+n+" is "+f);
	}

}


