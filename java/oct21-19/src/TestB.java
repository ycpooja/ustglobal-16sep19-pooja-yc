
public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person.color="white";
		person.sleep();
		System.out.println("person color="+person.color);
		System.out.println("*********************************************");
		person p=new person();
		p.age=12;
		p.name="roopa";
		System.out.println("person age="+p.age);
		System.out.println("person name="+p.name);
		p.eat();
		p.walk();
		System.out.println("*********************************************");
		person p1=new person();
		p1.age=21;
		p1.name="raju";
		System.out.println("person age="+p1.age);
		System.out.println("person name="+p1.name);
		p1.eat();
		p1.walk();



	}

}
