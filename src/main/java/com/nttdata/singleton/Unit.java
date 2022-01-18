package com.nttdata.singleton;

public class Unit {

	private String name;

	private Unit subordinate;

	public Unit(String name, Unit subordinate) {
		super();
		this.name = name;
		this.subordinate = subordinate;
	}

	public Unit(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void ExecuteCommand(String command) {

		if (subordinate != null) {

			System.out.println("enviada por "+ this.name +" hacia "+subordinate.name);
			subordinate.ExecuteCommand(command);

		} else {
			System.out.println("Ejecutado por " + name);
		}

	}

}
