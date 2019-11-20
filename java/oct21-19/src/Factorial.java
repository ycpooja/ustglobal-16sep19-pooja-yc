import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=fact(n);
		System.out.println(d);
	}
	static int fact(int n)
	{
		if(n<=0)
		{

			return 1;
		}
		else
		{
			return n*fact(n-1);
		}

	}

}

