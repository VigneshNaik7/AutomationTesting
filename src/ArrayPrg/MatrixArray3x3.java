package ArrayPrg;

public class MatrixArray3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][]= {{7,8,9},{4,5,6},{1,2,3}};
		int m3[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m3[i][j]=0;
				for(int k=0;k<3;k++) {
					m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
				}
				System.out.print(m3[i][j]+" ");
			}
			System.err.println(" ");
		}
	}

}
