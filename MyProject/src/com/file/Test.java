package com.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		Student s = new Student(1, "abc", 23);
		File file = new File("C:/Users/Taurus/Desktop/Student.ser");
		ObjectOutputStream out = null;
		FileOutputStream fout = null;
		
		try {
			file.createNewFile();
			fout = new FileOutputStream(file);
			out = new ObjectOutputStream(fout);
			out.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fout!=null){
					fout.flush();
					fout.close();
				}
				if(out!=null) {
					out.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
