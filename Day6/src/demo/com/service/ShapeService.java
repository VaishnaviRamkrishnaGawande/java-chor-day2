package demo.com.service;

import java.util.Scanner;

import demo.com.bean.Circle;
import demo.com.bean.Rectangle;
import demo.com.bean.Shape;
import demo.com.bean.Triangle;

public class ShapeService {
      static Shape sarr[];
      static int cnt;
      static {
    	 sarr=new Shape[5];
    	  cnt=0; 
      }
      public static void acceptData(int choice) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter color");
    	  String color=sc.next();
    	  switch(choice) {
    	  case 1:
    		  System.out.println("Enter Base");
    		  int base=sc.nextInt();
    		  System.out.println("Enter Height");
    		  int height=sc.nextInt();
    		  System.out.println("Enter Side1");
    		  int s1=sc.nextInt();
    		  System.out.println("Enter Side2");
    		  int s2=sc.nextInt();
              sarr[cnt]=new Triangle(color,base,height,s1,s2);
    		  break;
    	  case 2:
    		  System.out.println("Enter radius");
    		  float radius=sc.nextFloat();
    		  sarr[cnt]=new Circle(color,radius);
    		  break;
    	  case 3:
    		  System.out.println("Enter Lenght");
    		  int length=sc.nextInt();
    		  System.out.println("Enter Breadth");
    		  int breadth=sc.nextInt();
    		  sarr[cnt]=new Rectangle(color,length,breadth);
    		  break;
    	  }
      cnt++;
      }
      
    	  
    	  public static void CalculateDetails(int pos) {
    		  System.out.println(pos+"Area:"+sarr[pos].calcArea());
    		  System.out.println(pos+"Perimeter"+sarr[pos].calcPerimeter());
    	  }
      
  public static Shape[] getAllShapes() {
	  return sarr;
  }
    
}
