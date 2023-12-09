package com.app.bean;

public class Model {
	private int mid;

	public Model() {
		super();
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {

		return "Model [mid=" + mid + "]";
	}
}