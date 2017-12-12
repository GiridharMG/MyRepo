package com.practice;

public class DubuliLinkedList {

	private Node head;
	
	private Node tail;
	
	public boolean add(int data) {
		
		Node node = new Node(data);
		if(head==null){
			head=node;
			tail=head;
			return true;
		} else {
			tail.setNxt(node);
			node.setPre(tail);
			tail = node;
			return true;
		}
	}
	public int get() {
		if(head==null)
			throw new RuntimeException("Linked List is Empty");
		int data = tail.getData();
		tail = tail.getPre();
		if(tail == null)
			head = null;
		return data;
	}
}
