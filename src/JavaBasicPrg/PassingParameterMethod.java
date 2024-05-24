package JavaBasicPrg;

public class PassingParameterMethod {
	 
	public String view(String n) {
		return n;
	}
	public void mul(int a ,int b ,int c) {
		int x=a*b*c;
		int y=a+b+c;
		int z=a-b-c;
		double w=a/b/c;
		System.out.println("Multiplication "+x);
		System.out.println("Addition "+y);
		System.out.println("Subtraction "+z);
		System.out.println("Division "+w);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingParameterMethod p1 = new PassingParameterMethod();
		
		System.out.println("My name is "+ p1.view("Vignesh"));
		p1.mul(10,20 ,30);
			
	}

}
