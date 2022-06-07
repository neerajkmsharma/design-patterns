package com.avinya.creational.singelton;

import com.avinya.creational.factory.Teacher;

public class TestSingeltonWithStaticHolder {


	public static void main(String[] args) {
		SingeltonWithStaticHolder singeltonObject = SingeltonWithStaticHolder.getInstance();
		singeltonObject.simpleMethod();

		SingeltonWithStaticHolder singeltonObject2 = SingeltonWithStaticHolder.getInstance();
		singeltonObject2.simpleMethod();

		Teacher teacher = new Teacher();
		System.out.println(teacher);

		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
	}




}
