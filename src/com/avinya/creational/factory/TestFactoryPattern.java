package com.avinya.creational.factory;

public class TestFactoryPattern {
	
	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();

		Profession doc = professionFactory.getProfession("Doctor");
		doc.print();

	}
}
