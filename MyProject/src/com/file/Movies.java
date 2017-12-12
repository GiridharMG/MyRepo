package com.file;

public class Movies {

	public Movies(String name, int id, int rate) {
		super();
		this.name = name;
		this.id = id;
		this.rate = rate;
	}

	private String name;
	private int id;
	private int rate;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getRate() {
		return rate;
	}
}
