package com.file;

import java.io.Serializable;

public class Student implements Serializable{

	private int regno;
	private String name;
	private int age;
	
	public Student(int regno, String name, int age) {
		this.regno = regno;
		this.name = name;
		this.age = age;
	}
	public int getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
