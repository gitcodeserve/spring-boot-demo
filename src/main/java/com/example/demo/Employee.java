package com.example.demo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private int empID;
	private String empName;
	private String empDOB;
	
	public Employee() {
		
	}
	
	public Employee(int empID, String empName, String empDOB) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDOB = empDOB;
	}

	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}
	
	

}
