package com.mj;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	@JsonIgnore
	private String empPwd;

	public Employee() {
	}

	public Employee(int empId, String empName, double empSal, String empPwd) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empPwd = empPwd;
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

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empPwd=" + empPwd + "]";
	}
}
