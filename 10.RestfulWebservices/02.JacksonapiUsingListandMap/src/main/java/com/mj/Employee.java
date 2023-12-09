package com.mj;

import java.util.List;
import java.util.Map;

public class Employee {
	private int empId;
	private List<Integer> empPrjs;
	Map<Integer, String> empMap;

	public Employee() {
	}

	public Employee(int empId, List<Integer> empPrjs,

			Map<Integer, String> empMap) {
		this.empId = empId;
		this.empPrjs = empPrjs;
		this.empMap = empMap;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<Integer> getEmpPrjs() {
		return empPrjs;
	}

	public void setEmpPrjs(List<Integer> empPrjs) {
		this.empPrjs = empPrjs;
	}

	public Map<Integer, String> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, String> empMap) {
		this.empMap = empMap;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empPrjs=" + empPrjs + ", empMap=" + empMap + "]";
	}
}