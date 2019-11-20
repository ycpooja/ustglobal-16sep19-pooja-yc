
public class TestB {
static int b;
int a;
{
	a=10;
	b=20;
	System.out.println("non static block 1");
}
public static void main(String[] args) {
	System.out.println("program started");
	TestB b=new TestB();
	TestB b1=new TestB();
	System.out.println("program ended");
}
{
	System.out.println("non static block 2");
}
} 
