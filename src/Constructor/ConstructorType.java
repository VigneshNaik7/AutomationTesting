package Constructor;

public class ConstructorType {
	
	int x,y;
	
	ConstructorType(){	//default constructor
		x=100;
		y=200;
	}
	ConstructorType(int a, int b){  //parameter constructor
		x=a;
		y=b;
	}
	
	public void sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorType c1 = new ConstructorType(); // invoke detault constructor
		c1.sum();
		
		ConstructorType c2 = new ConstructorType(10,20); //invoke parameter constructor

		c2.sum();
	}

}
