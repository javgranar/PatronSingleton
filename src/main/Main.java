package main;

import entity.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = Persona.getInstance();
		persona.setNombre("Javi");
		System.out.println("1. " + persona.getNombre());
		
		Persona persona2 = Persona.getInstance();
		System.out.println("2. " + persona2.getNombre());

	}

}
