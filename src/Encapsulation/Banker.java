package Encapsulation;

public class Banker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj1 = new Account(1001001,576214,"vignesh");
		//obj1.show();
		System.out.println(obj1.getNumber());
		System.out.println(obj1.getPin());
		System.out.println(obj1.getName());
		
		System.out.println(" ");
		obj1.setName("Sai");
		System.out.println(obj1.getName());
		
	}

}


