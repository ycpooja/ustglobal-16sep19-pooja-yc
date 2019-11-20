public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstGen f=new FirstGen();
		f.call();
		f.msg();
		System.out.println("******************************");
		SecondGen s=new SecondGen();
		s.call();
		s.games();
		s.msg();
		System.out.println("********************************");
		ThirdGen t=new ThirdGen();
		t.call();
		t.camera();
		t.games();
		t.msg();
	}

}
