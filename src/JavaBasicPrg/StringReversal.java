package JavaBasicPrg;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		String rev=" ";
		System.out.println("Enter the string");
		Scanner r = new Scanner(System.in);
		word = r.next();
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
	}

}
