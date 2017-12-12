package com.test;

public class Rainbow {

	public enum MyColor {
		RED(0xff0000), Green(0x00ff00), BLUE(0x0000ff);
		
		private final int rgb;
		
		MyColor(int rgb) {
			this.rgb = rgb;
		}
		
		public void method() {
			// TODO Auto-generated method stub
			System.out.println(rgb);
		}
	};
	
	class OtherColor {
		void color() {
			System.out.println(MyColor.BLUE);
		}
	}
	
	public static void main(String...args) {
		MyColor color = MyColor.Green;
		System.out.println(color);
		color.method();
		System.out.println("hi");
	}
}
