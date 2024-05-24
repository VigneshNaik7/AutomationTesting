package Exception;

public class MultipalCatchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started..........................");
		
		String s = null;
		try {
		System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Message 1");
		}

		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("Message 2");
			
		}
		catch(Exception e) { // Note:- This one exception can handel all type of exception in java
							//			For example if you dont know which type of exception throws the program then you can use Exception
							//			Beacuse its the parent class for all the exception in the java
			System.out.println(e.getMessage());
			System.out.println("Message 3");
			
		}
		System.out.println("Program Stoped..........................");
		
	}

}
