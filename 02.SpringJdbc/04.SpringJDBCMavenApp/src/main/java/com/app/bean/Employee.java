package com.app.bean;

public class Employee {
	private int empid;
	private String empname;
	private String empgen;
	private String empaddr;

	public Employee() {
		super();
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

	public String getEmpgen() {
		return empgen;
	}

	public void setEmpgen(String empgen) {
		this.empgen = empgen;
	}

	public String getEmpaddr() {
		return empaddr;
	}

	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empgen=" + empgen + ", empaddr=" + empaddr
				+ "]";
	}

}
