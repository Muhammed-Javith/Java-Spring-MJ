package com.app.bean;

public class Employee {
	private int empId;
	private Address addr;

	public Employee() {
		super();
	}

	public Employee(int empId, Address addr) {
		super();
		this.empId = empId;
		this.addr = addr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {

		this.empId = empId;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", addr=" + addr + "]";
	}
}