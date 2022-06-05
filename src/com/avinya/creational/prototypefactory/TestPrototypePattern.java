package com.avinya.creational.prototypefactory;

public class TestPrototypePattern {
	public static void main(String[] args) {
		ProfessionPrototype.loadProffesionCache();
		
		Profession docProfession = ProfessionPrototype.getCloneNewProfession(1);
		System.out.println(docProfession);
		
		Profession engProfession = ProfessionPrototype.getCloneNewProfession(2);
		System.out.println(engProfession);
		
		Profession teachProfession = ProfessionPrototype.getCloneNewProfession(3);
		System.out.println(teachProfession);
		
		Profession docProfession2 = ProfessionPrototype.getCloneNewProfession(1);
		System.out.println(docProfession2);
		
		
		
	}
}
