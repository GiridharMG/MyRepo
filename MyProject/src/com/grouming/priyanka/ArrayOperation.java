package com.grouming.priyanka;

public class ArrayOperation {

	static int[] sortArray(int[] arr) {
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	static int[] missingInts(int[] arr) {
		arr = sortArray(arr);
		int[] res = new int[2];
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]){
				 res[0] = arr[i];
				 res[1] = arr[i]+1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] a = {5,2,1,3,3};
		int[] b = missingInts(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
