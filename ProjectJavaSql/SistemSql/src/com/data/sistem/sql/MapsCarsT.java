package com.data.sistem.sql;

public class MapsCarsT implements SendInicie {
	private MapsCarsT data;
	private String marca;
	private String placa;
	private String color;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public MapsCarsT(String marca, String placa, String color) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.color = color;
	}
	@Override
	public String toString() {
		return "\nMARCA: " + marca + ", PLACA: " + placa + ", COLOR: " + color;
	}
	
	public MapsCarsT getData() {
		return data;
	}
	public void setData(MapsCarsT mapsCarsT) {
		this.data = mapsCarsT;
	}
	
	public MapsCarsT(MapsCarsT mapsCarsT) {
		super();
		this.data = mapsCarsT;
	}
	
	@Override
	public void mainInice() {
		System.out.println("USTED ESTA MANEJANDO:"+data);
		
	}
	
	
	
	

		
	
}
