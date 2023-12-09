package com.app.bean;

public class Address {
	private String loc;

	public Address() {
		super();
	}

	public Address(String loc) {
		super();
		this.loc = loc;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [loc=" + loc + "]";
	}
}