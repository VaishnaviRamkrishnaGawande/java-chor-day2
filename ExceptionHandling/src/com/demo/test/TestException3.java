package com.demo.test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException3 {
	public static int division(int n1, int n2) {
		int ans=n1/n2;
		return ans;
		
	}
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<4;i++) {
		try
		{
			System.out.println("Enter num 1 : ");
			int n1=sc.nextInt();
			System.out.println("Enter num 2 : ");
			int n2=sc.nextInt();
			int ans=division(n1,n2);
			System.out.println("Division : "+ans);
		
		
		try {
            String s=null;			
			System.out.println(s);
			System.out.println(s.length());
			break;
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("In outer Block");
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("Number can't be divided by zero");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("djfs");
		}
		}
		}

}

	

	


		
	



