package com.data.userTrabajadores;

import java.util.ArrayList;

public class Trabajadores {
	
	public static ArrayList<Person> userTrabajador() {
		ArrayList<Person> linkedPerson = new ArrayList<>();
		linkedPerson.add(new Person("JAVIER ", "HERNANDEZ", "CALLE 11", 18));
		linkedPerson.add(new Person("GAEL", "VEGA", "CALLE 11", 21));
		linkedPerson.add(new Person("GAEL", "ALVAREZ", "CALLE 11", 18));
		linkedPerson.add(new Person("JOEL", "VARGAS", "CALLE 11", 23));
		
		//Main.outPerson(linkedPerson);
		
		return linkedPerson;
	}

}
