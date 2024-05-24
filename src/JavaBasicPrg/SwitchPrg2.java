package JavaBasicPrg;

import java.util.Scanner;

public class SwitchPrg2 {

	private static final String Jan = null;

	public static void main(String[] args) {
		Scanner m1 = new Scanner(System.in);
		System.out.println("Enter the month to search");
		String month = m1.nextLine();
		switch(month) {
		case "January":
			System.out.println(month+" :Beginning of the year!" );
			break;
		case "Febuary":
			System.out.println(month+" :Possibly leap year"); 
			break;
		case "March":
			System.out.println(month+" :International Women’s Day");
			break;
		case "April":
			System.out.println(month+" :April Fool’s Day!");
			break;
		case "May":
			System.out.println(month+" :Labour Day");

			break;
		case "June":
			System.out.println(month+" :World Environment Day");

			break;
		case "July":
			System.out.println(month+" :Kargil Vijay Diwas");

			break;
		case "Auguest":
			System.out.println(month+" :Independence Day");

			break;
		case "September":
			System.out.println(month+" :Teachers Day");

			break;
		case "October":
			System.out.println(month+" :Gandhi Jayanthi");

			break;
		case "November":
			System.out.println(month+" : Winter is now coming.!");

			break;
		case "December":
			System.out.println(month+" :End of the year!");

			break;
			default :
				System.out.println("Invalid input");
		}
		

	}

}
