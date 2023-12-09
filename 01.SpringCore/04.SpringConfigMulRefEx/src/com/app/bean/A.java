package com.app.bean;

public class A {
	private B ob;

	public A() {
		super();
	}

	public B getOb() {
		return ob;
	}

	public void setOb(B ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "A [ob=" + ob + "]";
	}
}