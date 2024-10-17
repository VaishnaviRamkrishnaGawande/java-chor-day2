package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable{
     private int empid;
     private String empname;
     private double salary;
     private double bonus;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, double salary, double bonus) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
     
}
