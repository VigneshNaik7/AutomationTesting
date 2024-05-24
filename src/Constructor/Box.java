package Constructor;

public class Box {
	//******************************** Constructor OverLoading ***************************************
	
	//Polymorphism:- One thing can have many form
	
	double height,width,depth;
	Box(){
		
		height=width=depth=0;
	}
	
	Box(double h,double w,double d){
		height=h;
		width=w;
		depth=d;
	}
	Box(double length){
		
		height=width=depth=length;
	}
	
	double volume() {
		return height*width*depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		System.out.println(b1.volume());
		System.out.println();
		
		Box b2 = new Box(10.2, 2.0, 5.0);
		System.out.println(b2.volume());
		System.out.println();
		
		Box b3 = new Box(10.5);
		System.out.println(b3.volume());
		
	}

}
