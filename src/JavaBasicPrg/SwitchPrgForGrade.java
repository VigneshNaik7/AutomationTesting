package JavaBasicPrg;

import java.util.Scanner;

public class SwitchPrgForGrade {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		Scanner grade =new Scanner(System.in);
		System.out.println("Enter the score scored in Exam");
		num = grade.nextInt();
		switch(num/10) {
		case 10,9 :
			System.out.println("The grade is A"); //90-100
			break;
		case 7,8:
			System.out.println("The grade is B"); //70-89
			break;
		case 4,5,6:
			System.out.println("The grade is C"); //40-69
			break;
		case 0,1,2,3: 
			System.out.println("The grade is Fail"); //0-39
			break;
			default:
				System.out.println("Invalid Input");
			
			
		}
		

	}

}
