package com.practice;

public class MainClass {

	public static void main(String[] args) {
		DubuliLinkedList dll = new  DubuliLinkedList();
		dll.add(10);
		dll.add(20);
		
		System.out.println(dll.get());
		System.out.println(dll.get());
		System.out.println(dll.get());
	}
}
