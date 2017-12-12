package com.collection;

import java.util.HashMap;

public class MapImpl {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		System.out.println(map.getOrDefault(2, "j2ee"));
	}
}
