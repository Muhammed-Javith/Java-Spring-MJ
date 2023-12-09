package com.app.bean;

public class B {
	private C oc;

	public B() {
		super();
	}

	public C getOc() {
		return oc;
	}

	public void setOc(C oc) {
		this.oc = oc;
	}

	@Override
	public String toString() {
		return "B [oc=" + oc + "]";
	}
}