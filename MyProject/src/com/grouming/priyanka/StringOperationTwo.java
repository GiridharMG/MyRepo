package com.grouming.priyanka;

public class StringOperationTwo {

	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	static String prefix(String[] arr) {
		String res = "";
		String prefix = arr[0];
		for (int i = 1; i < arr.length; i++) {
			for(int j = 0; j < min(prefix.length(), arr[i].length()); j++) {
				if(prefix.charAt(j)!=arr[i].charAt(j)) {
					break;
				}
				res = res + prefix.charAt(j);
			}
		}
		if(res.length()>0)
			return res;
		else
			return null;
	}
	
	public static void main(String[] args) {
		String[] str = {"abcghi", "abcdefgh", "abcdeghlmn"};
		System.out.println(prefix(str));
	}
}
