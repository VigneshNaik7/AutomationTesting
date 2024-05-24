package Exception;

public class Demo {
	
	
	public void dispaly(int a,int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		
		//d.dispaly(5, 0);
		
		try {
			d.dispaly(5, 0);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("invalid");
		}

	}

}
