package com.app.bean;

public class Product {
	private int pid;
	private Model mod;

	public Product() {
		super();
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Model getMod() {
		return mod;
	}

	public void setMod(Model mod) {
		this.mod = mod;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", mod=" + mod + "]";
	}
}