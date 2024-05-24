package Custom_Exception;

public class Demo {
	
	public void checkage(int age) throws Senior_Citizen{
		if(age<60) {
			throw new Senior_Citizen("Person is not a Senior Citizen", new RuntimeException());
		}
		System.out.println("Person is a Senior Citizen");
	}

	public static void main(String[] args) throws Senior_Citizen {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		d.checkage(50);
				

	}

}
