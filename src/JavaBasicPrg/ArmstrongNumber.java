package JavaBasicPrg;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp;
		int as = 0;
		System.out.println("Enter the number to find armstrong");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int number =num;
		while(num!=0) {
			
			temp=num%10;
			as=as+temp*temp*temp;
			num=num/10;
		}
		System.out.println(as);
		if(as==number) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not a Armstrong");
		}
	}

}
