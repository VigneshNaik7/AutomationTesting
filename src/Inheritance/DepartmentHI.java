package Inheritance;

public class DepartmentHI extends Univercity {
	
	public void HOD() {
		System.out.println("Head of the department is raju");
	}
public static void main(String[] argu) {
		
		DepartmentHI d1 = new DepartmentHI();
		d1.show();
		d1.HOD();
		
}
}
