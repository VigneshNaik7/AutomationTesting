package JavaBasicPrg;

import java.util.Scanner;

public class PanlindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		String rev="";
		
		System.out.println("enter the word");
		Scanner sc=new Scanner(System.in);
		word=sc.next();
		String n=word;
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
		if(n.equalsIgnoreCase(rev)) {
			System.out.println("palindrome ");
		}
		else {
			System.out.println("Not palindrome ");
		}
		

}
}