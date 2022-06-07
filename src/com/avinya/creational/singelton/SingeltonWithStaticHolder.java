package com.avinya.creational.singelton;

public class SingeltonWithStaticHolder {

	private static class InstanceHolder {
		public static SingeltonWithStaticHolder singeltonWithStaticHolder = new SingeltonWithStaticHolder();
	}

	private SingeltonWithStaticHolder() {
	}

	public static SingeltonWithStaticHolder getInstance() {
		return InstanceHolder.singeltonWithStaticHolder;
	}

	public void simpleMethod() {
		System.out.println("hashcode of singelton object" + InstanceHolder.singeltonWithStaticHolder);
	}
}

/*
This pattern is beneficial for at least 3 reasons:

Static factory
Lazy initialization
Thread safe
*/