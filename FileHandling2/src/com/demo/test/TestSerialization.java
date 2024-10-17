package com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import com.demo.beans.*;

public class TestSerialization {

	public static <Employee> void writeFile(List<Employee>lst) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata.txt"));){
			for(Employee s:lst) {
				oos.writeObject(s);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		private static void readFile() {
			try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata.txt"))){
				while(true) {
					Employee e=(Employee)ois.readObject();
					System.out.println(e);
				}
			}catch(EOFException e) {
				e.printStackTrace();	
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	  }
     public static void main(String []args) {
          List<Employee> elst=List.of(new Employee(1,"Vaish",20000,29183),new Employee(2,"Shivani",30000,23234));
          writeFile(elst);
          System.out.println("Reading....");
          readFile();
}
}
