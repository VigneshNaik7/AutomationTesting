package Constructor;

public class Student {
	int sid;
	String sname;
	char grade;
	
	public void dispaly() {
		System.out.println(sid+"  "+sname+"  "+grade);
		
	}
	public void setdata(int id,String name, char grade) { //passting variable is nothing but while passing the value during the object with method or consrtuctor
															//passed variable in setdata (id,name,grade))will asigne it to the local variable in the class(sid,sname,grade)
		sid=id;
		sname=name;
		this.grade=grade;
	}
	
	Student(int id,String name,char grade){
		sid=id;
		sname=name;
		this.grade=grade; //this keyword is used because both variable name (grade) is same, so that compiler can identify this.grade
								//is from local variable from class
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using object reference variable
//		Student s1 = new Student();
//		s1.sid=101;
//		s1.sname="vignesh";
//		s1.grade='A';
//		s1.dispaly();

		
		//using method
		/*Student s2 = new Student();
		s2.setdata(102,"nuthan",'A');
		s2.dispaly(); */
		
		
		//using Constructor
		Student s3 = new Student(103,"sai",'A');
		s3.dispaly();
		
	}

}

//****************************************Method*******************************************************
//1.Method name can be anything
//2.method may or may not return any value
//3.if method is not returning any value  then specify void
//4.method can take parameter/argument
//5.we have to invoke /call methods explicitly through object
//6.used for specifying logic


//|*******************************Constructor**************************************************
//Constructor name should be same as class name
//2.constructor will never return a value(not even a void)
//3.we don't specify the vouid
//4.Constructor can take parameter/argument
//5.Constructor automatically invoked at the time of object creation
//used for initilaizing the value of the variable