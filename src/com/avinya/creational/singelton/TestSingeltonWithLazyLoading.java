package com.avinya.creational.singelton;

import com.avinya.creational.factory.Teacher;

public class TestSingeltonWithLazyLoading {


	public static void main(String[] args) {
		SingeltonWithLazyLoading singeltonObject = SingeltonWithLazyLoading.getInstance();
		singeltonObject.simpleMethod();

		SingeltonWithLazyLoading singeltonObject2 = SingeltonWithLazyLoading.getInstance();
		singeltonObject2.simpleMethod();

		Teacher teacher = new Teacher();
		System.out.println(teacher);

		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
	}


}
