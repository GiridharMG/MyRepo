package com.practice;

public class Node {

	private int data;
	
	private Node pre;
	
	private Node nxt;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getNxt() {
		return nxt;
	}

	public void setNxt(Node nxt) {
		this.nxt = nxt;
	}

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}
	
}
