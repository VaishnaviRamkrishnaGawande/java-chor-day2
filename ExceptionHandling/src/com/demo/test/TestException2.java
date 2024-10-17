package com.demo.test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
		try
		{
			System.out.println("Enter num 1 : ");
			int n1=sc.nextInt();
			System.out.println("Enter num 2 : ");
			int n2=sc.nextInt();
			int ans=n1+n2;
			System.out.println("Addition : "+ans);
			ans=n1/n2;
			System.out.println("Division : "+ans);
			break;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter number : ");
			sc.nextLine();
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Number can't be divided by zero");
		}
		
		finally
		{
			System.out.println("finally block is always executed");
			//sc.close();
		}
		}
		System.out.println("Rssume the execution of remaining program");
	}
}

