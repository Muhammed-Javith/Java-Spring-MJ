package com.app.core;

import java.util.List;
import java.util.Map;

public class Address {
	private int empId;
	private String loc;

	private List<String> cords;
	private Map<Integer, String> details;

	public Address(int empId, String loc, List<String> cords, Map<Integer, String> details) {
		super();
		this.empId = empId;
		this.loc = loc;
		this.cords = cords;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Address [empId=" + empId + ", loc=" + loc + ", cords=" + cords + ", details=" + details + "]";
	}
}