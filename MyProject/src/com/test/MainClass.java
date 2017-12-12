package com.test;

public class MainClass {
	
	public static void main(String[] args) {
		String str = System.getProperty("hi");
		System.out.println(str);
		
		String str1 = "ABC";
		String str2 = "BC";
		
		System.out.println(str1.compareTo(str2));
	}
}
