package Com.demo.test;
import java.util.Scanner;
import Com.demo.service.Studentservice;
import Com.demo.service.StudentserviceImpl;
public class TestStudentListCollection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studentservice sservice=new StudentserviceImpl();
         int choice=0;
         do {
        	 System.out.println("1.Add new Student\n 2.Delete Student by Id\n 3.Modify marks\n 4.Search By Id\n"
        	 		+ " 5.Search By Marks > given Marks\n 6.Sort By name\n 7.Sort By marks\n 8.Sort By Id\n 9.Display All\n "
        	 		+ "10.Search By Name and Display in sorted order\n 11.Exit\n Choice : ");
        	 choice =sc.nextInt();  
        	 switch (choice) {
        	 case 1->{
        		 System.out.println("1.Master Student\n 2.Graduate Student\n 3.Faculty\n Choice : ");
        		int ch=sc.nextInt();
        		 sservice.addnewStudent(ch); 
        		 }
        	 case 2->{
        		 System.out.println("Enter Id for delete : ");
        		 int id=sc.nextInt();
        		boolean status=sservice.deleteById(id) ;
        			 if(status) {
        				 System.out.println("Deleted Successfully");
        			 }else {
        				 System.out.println("Not Found");
        		 }
        	 }
        	 
        	 }
         }while(choice!=11);
	}
	}


