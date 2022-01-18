package com.nttdata.singleton;

public class PersonSingle {

	static Person INSTANCE;

	public static Person getInstance(String name) {

		if (INSTANCE == null) {
			INSTANCE = new Person(name);
		}
		return INSTANCE;
	}

}
