package com.nttdata.singleton;

import com.nttdata.singleton.Person.PersonBuilder;

/**
 * BOOTCAMP-MICROSERVICE-SINGLETON
 */
public class App {
	/*
	 * Clase main de la app.
	 */
	public static void main(String[] args) {

		Person person = PersonSingle.getInstance("Manuel");
		Person person3 = person.Clone();

		System.out.println(person.getPerson());
		System.out.println(person3.getPerson());

		System.out.println(person);
		System.out.println(person3);

		Person person4 = PersonBuilder.Builder().Name("Alfonso").Build();

		System.out.println(person4.getPerson());

		PersonDecorator pDecorator = new PersonDecorator(person);
		System.out.println(pDecorator.getPerson());

		PersonProxy pProxy = new PersonProxy(person3);
		pProxy.Operation();

		Unit soldado = new Unit("Soldado");

		Unit sargento = new Unit("Sargento", soldado);

		Unit capitan = new Unit("Capitan", sargento);

		capitan.ExecuteCommand("Ejecución");

	}
}
