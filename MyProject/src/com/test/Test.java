package com.test;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		Random random = new Random();
		int ran = random.nextInt(9);
		String str = ran +""+(char)(input%9 + 33);
		int i = 0;
		while(str.length()<input) {
			char c = (char)(65+i);
			str = str+c;
			i++;
		}
		System.out.println(str);
	}
}
