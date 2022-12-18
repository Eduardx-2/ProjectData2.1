package com.data.userTrabajadores;

public class Person {
	
	private String nombre;
	private String apellido;
	private String sede;
	private int edad;
	
	
	public Person(String nombre, String apellido, String sede, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sede = sede;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getSede() {
		return sede;
	}
	
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[NOMBRE: " + nombre + ", APELLIDO: " + apellido + ", SEDE: " + sede + ", EDAD: " + edad + "]";
	}
	
	


}
