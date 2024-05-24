package Threads;



//*******************************************Thread*************************************
//If you want to convert the program to thread you have to follow 3 rules
//1.Trun your class into thread with extends keyword
//2.Trun your method  into run
//3.Call the method start in the main method instaed of run

	class C extends Thread 
	{
		public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Hi");
			}
		}
	}
	class B extends Thread {
		
		public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Hello");
		}
		
	}
		
	}
	
	class D extends Thread{
		
		public void run() {
			for(int i=1;i<100;i++) {
				System.out.println("God");
			}
		}
	}

	public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C obj1 = new C();
		B obj2 = new B();
		D obj3 = new D();
		
		//obj1.start();
		obj2.start();
		obj3.start();

	}

}
	
