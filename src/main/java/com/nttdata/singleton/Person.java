package com.nttdata.singleton;

import com.nttdata.repository.IPerson;
import com.nttdata.repository.IPersonInterface;
import com.nttdata.repository.IPersonProxy;

/*
 * Clase Person del proyecto singleton.
 */

public class Person implements IPerson,IPersonInterface,IPersonProxy {

	private String name;

	// Método Constructor.
	public Person(String name) {
		super();
		this.name = name;
	}

	private Person(PersonBuilder personBuilder) {
		super();
		this.name = personBuilder.name;
	}
	
	@Override
	public String getPerson() {
		return name;
	}

	@Override
	public Person Clone() {
		Person p = new Person(this.name);
		return p;
	}
	
	@Override
	public void Operation() {
		System.out.println("Añadido por Operation() de la clase Person");
		
	}

	/*
	 * Clase PersonBuilder del proyecto singleton.
	 */
	public static class PersonBuilder {
		private String name;

		public PersonBuilder Name(String name) {
			this.name = name;
			return this;
		}

		public Person Build() {
			return new Person(this);
		}

		public static PersonBuilder Builder() {
			return new PersonBuilder();
		}
	}

}
