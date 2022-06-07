package com.avinya.creational.singelton;

public class SingeltonWithLazyLoading {

	private static volatile SingeltonWithLazyLoading singletonInstance = null;

	private SingeltonWithLazyLoading() {

	}

	// Get the only object available
	public static SingeltonWithLazyLoading getInstance() {
		
		if (singletonInstance == null) { //Double check locking
			synchronized (SingeltonWithLazyLoading.class) {

				if (singletonInstance == null) {
					singletonInstance = new SingeltonWithLazyLoading(); //Lazy loading of the object
				}
			}
		}

		return singletonInstance;
	}

	public void simpleMethod() {
		System.out.println("hashcode of singelton object" + singletonInstance);
	}

}
