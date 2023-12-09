package com.app.core;

public class Address {
	private String addr;

	public Address() {
		super();

	}

	public Address(String addr) {
		super();
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + "]";
	}
}