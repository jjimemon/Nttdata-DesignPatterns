package com.nttdata.singleton;

import com.nttdata.repository.IPersonInterface;

public class PersonDecorator implements IPersonInterface {

	Person person;

	public PersonDecorator(Person person) {
		super();
		this.person = person;
	}

	@Override
	public String getPerson() {
		return "Su nombre es: " + person.getPerson();
	}

}
