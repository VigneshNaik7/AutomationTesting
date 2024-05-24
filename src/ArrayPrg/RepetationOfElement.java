package ArrayPrg;

import java.util.Scanner;

public class RepetationOfElement {

	public static void main(String[] args) {
		int a[]= {10,20,10,30,40,10};
		Scanner Arr = new Scanner(System.in);
		System.out.println("Find the number how much time it is repetaed");
		int x= Arr.nextInt();
		int count =0;
	
		for(int i=0;i<a.length;i++) {
			if(x==a[i]) {
				count++;

			}

		}
		System.out.println("The number is repeted for "+count+" times");

		
		// TODO Auto-generated method stub

	}

}
