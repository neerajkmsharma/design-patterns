package com.avinya.creational.factory;

public class ProfessionFactory {

	public Profession getProfession(String professionType) {
		if (professionType == null) {
			return null;
		}

		if ("Doctor".equalsIgnoreCase(professionType)) {
			return new Doctor();
		} else if ("Engineer".equalsIgnoreCase(professionType)) {
			return new Engineer();

		} else if ("Teacher".equalsIgnoreCase(professionType)) {
			return new Teacher();
		} else {
			return null;
		}
	}

}
