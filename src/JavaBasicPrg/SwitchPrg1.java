package JavaBasicPrg;

import java.util.Scanner;

public class SwitchPrg1 {

	public static void main(String[] args) {
		//int month;
		Scanner MyObj = new Scanner(System.in);
		System.out.println("Enter the month of the year");
		int month = MyObj.nextInt();
		switch(month)
		{		
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Auguest");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		}

	}

}
