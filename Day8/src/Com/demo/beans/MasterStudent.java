package Com.demo.beans;

import java.time.LocalDate;

public class MasterStudent extends Student{
	private String thesisSub,Degree;
	private int thesisMarks;
	public MasterStudent(int id, String name, String address, String bdate, int[] mks, String tsub, String degree2, int tmarks) {
		super();
	}
	public MasterStudent(int pid,String pname,String address ,LocalDate bdate ,int[] marks , String thesisSub, String degree, int thesisMarks) {
		super(pid ,pname,address,bdate, marks);

		this.thesisSub = thesisSub;
		this.Degree = degree;
		this.thesisMarks = thesisMarks;
	}
	public String getThesisSub() {
		return thesisSub;
	}
	public void setThesisSub(String thesisSub) {
		this.thesisSub = thesisSub;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public int getThesisMarks() {
		return thesisMarks;
	}
	public void setThesisMarks(int thesisMarks) {
		this.thesisMarks = thesisMarks;
	}
	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thesisSub=" + thesisSub + ", Degree=" + Degree + ", thesisMarks=" + thesisMarks + "]";
	}
	
	
	

}
