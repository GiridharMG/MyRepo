package com.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		File file = new File("d:/javaprogs/ser.txt");
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream(file);
			out = new ObjectOutputStream(fout);
			out.writeObject(new Movies("Googly", 101, 10));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
