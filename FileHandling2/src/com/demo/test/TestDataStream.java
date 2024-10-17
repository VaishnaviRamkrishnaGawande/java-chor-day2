package com.demo.test;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDataStream {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("test.txt"));
			System.out.println("Enter number : ");
			int number =sc.nextInt();
			System.out.println("Enter name : ");
			String name=sc.next();
			System.out.println("Enter salary : ");
		    double salary=sc.nextDouble();
			dos.writeInt(number);
			dos.writeUTF(name);
			dos.writeDouble(salary);
		} catch (IOException e) {
			System.out.println("Error while reading file");
		} 
		try (DataInputStream dis=new DataInputStream(new FileInputStream("test.txt"))) {
			int n=dis.readInt();
			String s=dis.readUTF();
			double sal=dis.readDouble();
			System.out.println(n+","+s+","+sal+",");
		}catch (IOException e) {
			System.out.println("Error while writing file");
		} 
	}
}


