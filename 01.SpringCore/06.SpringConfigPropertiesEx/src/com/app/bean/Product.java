package com.app.bean;

public class Product {
	private int pId;
	private String pname;

	public Product() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pname=" + pname + "]";
	}
}