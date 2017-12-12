package com.test;

public class SingleTon {
	private SingleTon() {}
	private static SingleTon ref;
	public static SingleTon getSingleTon() {
		if(ref == null)
			ref = new SingleTon();
		return ref;
	}
	public static class SubSingleTon {
		public static SingleTon getSingleTon() {
			return new SingleTon();
		}
	}
}
