package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) {
		File file = new File("C:/Users/Taurus/Desktop/Student.ser");
		FileInputStream fin = null;
		ObjectInputStream in = null;
		
		try {
			fin = new FileInputStream(file);
			in = new ObjectInputStream(fin);
			Object obj = in.readObject();
			Student s = (Student)obj;
			System.out.println(s.getName()+" "+s.getRegno()+" "+s.getAge());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fin!=null)
					fin.close();
				if(in!=null)
					in.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
