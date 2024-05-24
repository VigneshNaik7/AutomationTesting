package JavaBasicPrg;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121, rev=0,rem;
		int temp=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(+rev);
		if(temp==rev) {
			System.out.println("Number is palindrom");
		}
			else {
				System.out.println("Number is not a palindrom");
		}
	}

}
