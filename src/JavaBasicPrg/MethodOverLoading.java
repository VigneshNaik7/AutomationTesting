package JavaBasicPrg;

public class MethodOverLoading {
	
	public void  mul(double d, double y) {
		System.out.println("Division of 2 number is  "+  (d/y));
	}
	public void mul(int a, int b,int c) {
		
		System.out.println("Multiplication of 3 number is  "+  (a*b*c));
	}
	public void mul (int a,int b) {
		System.out.println("Subtraction of 4 number is  "+  (a-b));
	}
	public void mul(String a, String b) {
		System.out.println("concatenation of 2 string is  "+  (a+b));
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading m = new MethodOverLoading();
		m.mul(100.0, 20);
		m.mul("Method", "Overloading");
		m.mul(10, 20,30);
		m.mul(600, 100);
		
	}

}
