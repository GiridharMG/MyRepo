package com.test;

public class SuperClass2 {

	public void name2() {
		System.out.println("Super class 2");
	}
	
	public class SubClass extends SuperClass1 {
		public void name3() {
			System.out.println("Sub Class");
		}
	}
}
