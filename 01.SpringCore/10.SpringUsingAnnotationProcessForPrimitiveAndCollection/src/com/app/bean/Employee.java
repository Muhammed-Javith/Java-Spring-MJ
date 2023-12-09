package com.app.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObj")
public class Employee {
	@Value("100")
	private int empId;
	@Value("Vicky raj")
	private String empName;
	@Value("5.5")
	private double empSal;
	@Value("#{lstObj}")
	private List<String> cords;
	@Value("#{mapObj}")

	private Map<Integer, String> stands;
	@Value("#{propObj}")
	private Properties props;

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

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public List<String> getCords() {
		return cords;
	}

	public void setCords(List<String> cords) {
		this.cords = cords;
	}

	public Map<Integer, String> getStands() {
		return stands;
	}

	public void setStands(Map<Integer, String> stands) {
		this.stands = stands;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", cords=" + cords
				+ ", stands=" + stands + ", props=" + props + "]";
	}
}