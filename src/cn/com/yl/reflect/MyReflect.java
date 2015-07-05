package cn.com.yl.reflect;

import cn.com.yl.dp.*;

public class MyReflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get Class Object of a Class, there are three ways
		// method1
		Class<?> classObject1 = Observer.class;  // if we knows the name of the class
		// method2
		Observer observerObj = new Observer();
		Class<?> classObject2 = observerObj.getClass(); // if we have the object of the class
		// method3
		try {
			// must use the full path. if we only know the path at the compile time
			Class<?> classOjbect3 = Class.forName("cn.com.yl.dp.Observer"); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 
		
	}

}
