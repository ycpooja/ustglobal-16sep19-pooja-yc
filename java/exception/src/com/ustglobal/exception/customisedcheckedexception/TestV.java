package com.ustglobal.exception.customisedcheckedexception;

import java.util.Scanner;

public class TestV {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		try(Scanner sc=new Scanner(System.in);
				Scanner sc2=new Scanner(System.in)){
			System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("age is"+age);

			System.out.println(age/0);

		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}finally{
			System.out.println("finally excecuted");
		}
	}
}
