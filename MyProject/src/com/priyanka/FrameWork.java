package com.priyanka;

import java.util.PriorityQueue;

@SuppressWarnings("rawtypes")
public class FrameWork {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(2);
		queue.add(10);
		queue.add(1);
		while(!queue.isEmpty())
			System.out.println(queue.poll());
	}
}
