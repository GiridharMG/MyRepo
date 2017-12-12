package com.grouming.priyanka;

public class StringOperationOne {
	
	static boolean checkPalendrom(String str) {
		for(int i = 0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	static int makePalindrom(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch[] = new char[str.length()-count];
			for(int j=0; j<ch.length; j++) {
				ch[j] = str.charAt(j);
			}
			String res = new String(ch);
			if(checkPalendrom(res))
				break;
			else
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(makePalindrom("AACEAAAA"));
	}
}
