package ArrayPrg;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][]= {{10,20,0,4},{40,60,0,5},{70,80,0,2}};
		System.out.println("rows  "+n.length);
		System.out.println("column  "+n[0].length);
		

		for(int i=0;i<3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
