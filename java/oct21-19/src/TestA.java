public class TestA {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.cost=100;
		p.color="red";
		p.brand="reynolds";
		System.out.println("cost is" +p.cost);
		System.out.println("color is" +p.color);
		System.out.println("brand is" +p.brand);
		p.write();

		System.out.println("*******************************************");

		Van v=new Van();
		v.cost=100000;
		v.color="brown";
		System.out.println("cost is" +v.cost);
		System.out.println("color is" +v.color);
		v.move();

		System.out.println("*******************************************");

		Van v1=new Van();
		v1.cost=200000;
		v1.color="black";
		System.out.println("cost is" +v1.cost);
		System.out.println("color is" +v1.color);
		v1.move();

		System.out.println("**********************************************");

		Cow c=new Cow();
		c.color="brown";
		c.name="radha";
		System.out.println("name is"+c.name);
		System.out.println("color is"+c.color);
		c.eat();
		c.sleep();
		System.out.println("**********************************************");

		Cow c1=new Cow();
		c1.color="white";
		c1.name="tunga";
		System.out.println("name is"+c1.name);
		System.out.println("color is"+c1.color);
		c.eat();
		c.sleep();
	}
}
