package com.jdbc;

import java.lang.reflect.Field;

public class Test extends ClassLoader {

	Object myClone(Object obj) {
		return null;
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Test t = new Test();
		JDBC j = (JDBC)t.loadClass("com.jdbc.JDBC").newInstance();
		j.main(null);
	}
}
