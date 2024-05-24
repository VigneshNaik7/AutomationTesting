package ArrayPrg;

public class OddEvenArray {
	public static void main(String[] args) {
		int a[]= {7,10,8,9,3};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even numbers are :"+a[i]);
			}
			else if(a[i]%2==1) {
				System.out.println("odd numbers are :"+a[i]);
			}
		}
		 
		
	}

}
