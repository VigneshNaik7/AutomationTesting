package ArrayPrg;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		Scanner Arr = new Scanner(System.in);
		System.out.println("Enter the element to search in array");
		int x=Arr.nextInt();
		
	//	int x=50;
		for(int i=0;i<a.length;i++) {
			if(x==a[i]) {
				System.out.println("The number found is  " +a[i]);
				break;
				
			}
			
			}
		System.out.println("Number not found");
		

			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}


