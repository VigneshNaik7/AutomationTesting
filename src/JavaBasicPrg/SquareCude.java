package JavaBasicPrg;

public class SquareCude {
	int y;
	
	public int square(int x){
		y=x*x;
		return y;
	}
	public int cube(int a) {
		return a*a*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquareCude sc = new SquareCude();
		System.out.println("The square root is  " +sc.square(4) );
		System.out.println("The Cube root is  "+sc.cube(5));
			
		

	}

}
