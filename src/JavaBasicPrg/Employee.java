package JavaBasicPrg;

import ArrayPrg.ArrayObject;
import ArrayPrg.CarsInArray;

public class Employee {
	
	int eid;
	String ename;
	String job;
	int salary;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(salary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.eid=101;
		emp1.ename="vignesh";
		emp1.job="Manager";
		emp1.salary=25000;
		emp1.display();
		
//		CarsInArray a1 = new CarsInArray();
//		System.out.println(a1.car);
		
//		ArrayObject ao = new ArrayObject(); // Accessing the class from different package
//		ao.view();
		
		

	}

}
