package Encapsulation;

public class Account extends Banker {
	private  int number;
	private int pin;
	private String name;
	
	Account(int number,int pin, String name){
		this.number=number;
		this.pin=pin;
		this.setName(name);
		
	}
	private	void show() {
		System.out.println("This " +number+  " and " +pin+ " belong to "  +name);
	}
	
	public int getNumber() {
		return  this.number;
		// return System.out.println("Number is " +this.number);
	}
	
	public int getPin() {
		return this.pin; 
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	

}
