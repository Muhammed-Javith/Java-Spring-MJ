package com.app.bean;

import org.springframework.stereotype.Component;

@Component("empObj")
public class Employee {

	private int empId;
	private String empName;

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ",empName=" + empName + "]";
	}
}