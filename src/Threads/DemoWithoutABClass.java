package Threads;

public class DemoWithoutABClass {

	public static void main(String[] args) {
		
		Runnable obj1 = new Runnable() { //when we put flower bracket inside the runnable interface we can create class inside the runable interface
			
			@Override
			public void run() {
				for(int i=1;i<=100;i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		}; //this is the class closed inside the runabele interface
		Runnable obj2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=100;i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						
					}
				}
				
				
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
