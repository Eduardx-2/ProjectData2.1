package com.data.sistem.sql;

public class CarrosData {
	private String marca;
	private String color;
	private int añoCarro;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAñoCarro() {
		return añoCarro;
	}
	public void setAñoCarro(int añoCarro) {
		this.añoCarro = añoCarro;
	}
	
	public CarrosData(String marca, String color, int añoCarro) {
		super();
		this.marca = marca;
		this.color = color;
		this.añoCarro = añoCarro;
	}
	@Override
	public String toString() {
		return "[MARCA: " + marca + ", COLOR: " + color + ", AÑO: " + añoCarro + "]";
	}
	
	
	

}
