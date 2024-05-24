package Threads;

class A extends Thread{
	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {}
		}
	}
}
class Z extends Thread{
	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {
				
			}
		}
	}
}

public class DemoTryCatch {

	public static void main(String[] args) {
		
		A obj1 = new A();
		Z obj2 = new Z();
		
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}
		obj2.start();

	}

}
