package com.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Compiler.enable();
		Compiler.command("javac");
		boolean b = Compiler.compileClass(MainClass.class);
		System.out.println(b);
	}
}
