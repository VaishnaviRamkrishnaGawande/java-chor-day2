package Com.demo.dao;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import Com.demo.beans.GraduateStudent;
import Com.demo.beans.MasterStudent;
import Com.demo.beans.Person;
import Com.demo.beans.Student;
import Com.demo.service.Studentservice;

public class StudentDaoImpl implements  StudentDao {
	
      private static List<Student> studlst;
      static {
    	  studlst=new ArrayList<>();
    	  studlst.add(new GraduateStudent(1,"Vaishnavi","Pune",LocalDate.of(2002, 07, 10),new int[] {90,89},89));
    	  studlst.add(new MasterStudent(10,"Vaish","Kolhapur",LocalDate.of(2002, 8, 05), new int[] {99,100},"English","Engg",99));
      }
	@Override
	public void addnewStudent(Student s) {
		studlst.add(s);
		}

	@Override
	public Student findById(int id) {
		int pos=studlst.indexOf(new Person(id));
		if(pos!=-1) {
			return studlst.get(pos);
		}
		return null;
	}

	@Override
	public boolean getById() {
	
	}

	


