package ArrayPrg;

import java.util.Arrays;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,7,2};
		System.out.println(Arrays.toString(a));
		int arraysum=0; //Initially sum of array is 0
		int l =a.length+1;  // The length of the array if the missing number were present
		int sum=(l * (l + 1)) / 2; //Sum of numbers from 1 to n using the formula (l * (l + 1)) / 2

		for(int i=0;i<a.length;i++) {
			arraysum=arraysum+a[i];
			
		}
		int missingnumber=sum-arraysum;
		System.out.println("Missing number is .."+missingnumber);

	}

}
