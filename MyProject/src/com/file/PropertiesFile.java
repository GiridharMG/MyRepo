package com.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		File file = new File("D:/java.properties");
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		FileOutputStream out = null;
		Properties properties = null;
		
		try {
			fileReader = new FileReader(file);
			properties = new Properties();
			properties.load(fileReader);
			System.out.println(properties.getProperty("id"));
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fileReader!=null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			fileWriter = new FileWriter(file);
			out = new FileOutputStream(file);
			properties = new Properties();
			properties.setProperty("id", "1");
			properties.put("id", "1");
			properties.store(fileWriter,"");
			properties.store(out, "");
		} catch (Exception e) {
			// TODO: handle exceptionss
			e.printStackTrace();
		}finally {
			try {
				fileWriter.flush();
				fileWriter.close();
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
