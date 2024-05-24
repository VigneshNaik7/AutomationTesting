package Constructor;

public class Program1 {
	String name;
	int age;
	String country;
	Program1(String name1,int age1,String country1){
		this.name=name1;
		this.age=age1;
		this.country=country1;
		
	}
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	public void senior() {
		if(this.age>60) {
			System.out.println("Age is above senior "+ this.age);
		}
		else
		{
			System.out.println("Age is below senior "+ this.age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p1 = new Program1("vignesh", 25, "India");
		Program1 p2 = new Program1("sai", 65, "India");
		p1.eat();
		p1.senior();
		System.out.println(" ");
		p2.eat();
		p2.senior();
		

	}

}
