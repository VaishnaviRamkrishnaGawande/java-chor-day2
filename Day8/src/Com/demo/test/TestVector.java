package Com.demo.test;

import java.util.Vector;

public class TestVector {
  public static void main(String[] args) {
	  Vector<Integer> a=new Vector(100);
	  System.out.println("Capacity : "+a.capacity());
	  a.add(8);
	  a.add(10);
	  a.add(22);
	  System.out.println(a);
	  System.out.println("Size : "+a.size());
//To add and increment the array 
	  for(int i=0;i<10;i++) {
		  a.add(i+100);
		  System.out.println(a);
	  }
		  System.out.println("Capacity : "+a.capacity());
		  System.out.println("Size : "+a.size());
	     //delete the given integer
		  a.remove(new Integer(10));
	      System.out.println(a);
	      System.out.println("Capacity : "+a.capacity());
	      System.out.println("Size : "+a.size());
		  
		  
		  
  }
}
