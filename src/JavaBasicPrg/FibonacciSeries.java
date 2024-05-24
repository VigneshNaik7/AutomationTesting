package JavaBasicPrg;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3,f4;
		int num;
		System.out.println("Enetr the upto check");
		Scanner fb = new Scanner(System.in);
		num=fb.nextInt();
		for(int i=1;i<=num;i++) {
			if(i<=1) {
				f3=f1;
				f4=f2;
			}
			else {
			f1=f1+f2;
			f2=f1+f2;
			f3=f1;
			f4=f2;
			}
			System.out.print( f3+" "+f4+" ");
			
		}
	}

}
