package com.grouming.priyanka;

public class IntegerOperationOne {

	static int div(int x, int y){
		if(x<y){
			x = x+y;
			y = x-y;
			x = x-y;
		}
		int count = 0;
		for(int i = 1; i<y+1; i++) {
			if(x%i==0 && y%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(div(6, 12));
	}
}
