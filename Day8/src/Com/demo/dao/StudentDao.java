package Com.demo.dao;

import Com.demo.beans.Student;

public interface StudentDao {

	void addnewStudent(Student s);

	boolean getById();

	Student findById(int id);

}
