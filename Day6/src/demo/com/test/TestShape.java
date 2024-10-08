package demo.com.test;
import java.util.Scanner;

import demo.com.bean.Circle;
import demo.com.bean.Shape;
import demo.com.bean.Triangle;
import demo.com.service.ShapeService;

public class TestShape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice =0 ;
		
		for(int i=0;i<2;i++)
		{
			System.out.println("1. Triangle \n 2. Circle \n 3.Rectanle \n Choice : ");
			choice= sc.nextInt();
			ShapeService.acceptData(choice);
		}
		for(int i=0;i<2;i++)
		{
			ShapeService.CalculateDetails(i);
		}
		int cntTriangle=0;
		int cntCircle=0;
		int cntRectangle=0;
		
		Shape [] sarr=ShapeService.getAllShapes();
		
		for(int i=0;i<sarr.length;i++)
		{
		
			if(sarr[i] instanceof Triangle)
				cntTriangle++;
			else if(sarr[i] instanceof Circle)
				cntCircle++;
			else
				cntRectangle++;
		}
		
		System.out.println("Triangle count :"+cntTriangle);
		System.out.println("Circle count : "+cntCircle);
		System.out.println("Rectangle count : "+cntRectangle);
		

	}

}
