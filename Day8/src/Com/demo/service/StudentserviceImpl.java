package Com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Com.demo.beans.GraduateStudent;
import Com.demo.beans.MasterStudent;
import Com.demo.beans.Student;
import Com.demo.dao.StudentDao;
import Com.demo.dao.StudentDaoImpl;
public class StudentserviceImpl implements Studentservice {
	private StudentDao sdao;

	public StudentserviceImpl() {
		super();
		sdao =new StudentDaoImpl();
	}


	@Override
	public void addnewStudent(int ch) {
		Scanner sc=new Scanner(System.in);
			 System.out.println("Enter your Id : ");
			 int id=sc.nextInt();
			 System.out.println("Enter your Name : ");
			 String name=sc.next();
			 System.out.println("Enter your Address");
			 String address=sc.next();
			 System.out.println("Enter BirthDate(dd/MM/yyyy)");
			 String bdate=sc.next();
			 LocalDate ldt=LocalDate.parse(bdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			 int[] mks=new int[2];
			 Student s=null;
			 if(ch==1 || ch==2) {
				 System.out.println("Enter marks1 : ");
				 mks[0]=sc.nextInt();
				 System.out.println("Enter marks2 : ");
				 mks[1]=sc.nextInt();
				
			 }
			 if(ch==1) {
				 System.out.println("Enter Thesis Subject : ");
				 String Tsub=sc.next();
				 System.out.println("Enter Thesis marks : ");
				 int Tmarks=sc.nextInt();
				 System.out.println("Enter Master Degree : ");
				 String degree=sc.next();
				 s=new MasterStudent(id,name,address,ldt,mks,Tsub,degree,Tmarks);
			 }else if(ch==2) {
				 System.out.println("Enter Special Subject marks : ");
				 int spsub=sc.nextInt();
				s=new GraduateStudent(id,name,address,ldt,mks,spsub);
			 }else {
				 //faculty 
			 }
				 sdao.addnewStudent(s);
			 }


	@Override
	public boolean deleteById(int id) {
		return sdao.getById();

	}

			 
		
	}

