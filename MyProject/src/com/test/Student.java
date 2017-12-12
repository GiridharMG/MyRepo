package com.test;

public class Student implements Cloneable {

	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	Student getObj() throws CloneNotSupportedException{
		return (Student) clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(1, "abc");
		Student s2 = (Student)s1.clone();
		System.out.println(s1.name);
		System.out.println(s2.name);
		s2.name = "qwe";
		System.out.println(s1.name);
		System.out.println(s2.name);
	}
}
