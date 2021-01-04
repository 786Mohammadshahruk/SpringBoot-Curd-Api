package com.TesQuirel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	private String employeeName;
	private String employeeAdd;
	private long employeeContectNumber;
	
	private  char employeeActive;
	
	public void setEmployeeactive(char employeeactive){
		this.employeeActive = employeeactive;
	}
	
	public char getEmployeeactive() {
		return employeeActive;
	}


	public void setEmployeeContectNumber(long emp)
	{
		this.employeeContectNumber=emp;
	}
	
	public long getEmployeeContectNumbe()
	{
		return employeeContectNumber;
	}	
	

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAdd() {
		return employeeAdd;
	}
	public void setEmployeeAdd(String employeeAdd) {
		this.employeeAdd = employeeAdd;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdd=" + employeeAdd
				+ "]";
	}
	

}
