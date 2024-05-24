package JavaBasicPrg;

public class Quadrilateral {
	public void shape(int s1,int s2,int s3,int s4) {
		if(s1==s2 && s2==s3 && s3==s4) {
			System.out.println("The following quadrilateral is square");
		}
		else {
			System.out.println("The following quadrilateral  is not square");
		}
	}
	public void shape(int s1,int s2,int s3) {
		if(s1==s2 && s2==s3) {
			System.out.println("The following quadrilateral  is triangle");
		}
		else
		{
			System.out.println("The following quadrilateral  is not traingle");
		}
	}
	public void shape(int s1,int s2,int s3,int s4,int s5) {
		if(s1==s2 && s2==s3 && s3==s4 && s4==s5) {
			System.out.println("The following quadrilateral  is pentagon");
		}
		else
		{
			System.out.println("The following quadrilateral  is not pentagon");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrilateral pts =new Quadrilateral();
		pts.shape(3, 3, 3);
		pts.shape(4,4, 4, 3);
		pts.shape(5, 5, 5, 5, 3);
		

	}

}
