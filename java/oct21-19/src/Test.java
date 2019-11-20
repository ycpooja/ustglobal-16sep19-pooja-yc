
public class Test {
public static void main(String[] args) {
	Btm b =new Btm();
	b.swipe();
	Btm b1=new Btm();
	b1.swipe();
	System.out.println("count of b="+b.getCount());
	System.out.println("count of b1="+b.getTotalCount());
	System.out.println("count of b="+b1.getCount());
	System.out.println("count of b1="+b1.getTotalCount());

}
}
