package JavaBasicPrg;

public class Array2Dimensional {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40},{50,60}};
		//Enhanced for loop
		for(int i[]:a) {
			for(int j:i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}


//for(int i=0;i<a.length;i++);{
//	for(int j=0;j<a[0].length;j++) {
//		
//		System.out.print(a[i][j] +"");
//	}
//	System.out.println();
//	}
//}
