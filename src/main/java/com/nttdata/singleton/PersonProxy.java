package com.nttdata.singleton;

import com.nttdata.repository.IPersonProxy;

public class PersonProxy implements IPersonProxy {

	Person person;

	public PersonProxy(Person person) {
		super();
		this.person = person;
	}

	@Override
	public void Operation() {
		this.Before();
		person.Operation();
		this.After();
	}
	
	public void Before() {
		System.out.println("Añadido por Before() de la clase PersonProxy");
	}
	
	public void After() {
		System.out.println("Añadido por After() de la clase PersonProxy");
		
	}

}
