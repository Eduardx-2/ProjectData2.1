package com.data.userTrabajadores;

import java.util.HashMap;
import java.util.Map;

public class CarrosUser {
	
	public static Map<Integer, String> userCarros() {
		Map<Integer, String> carrosMain = new HashMap<>();
		carrosMain.put(1, "TOYOTA - 2006");
		carrosMain.put(2, "TOYOTA - 2007");
		carrosMain.put(3, "CHEVROLET - 2015");
		carrosMain.put(4, "CHEVROLET - 2010");
		
		carrosMain.entrySet().stream().forEach(e -> System.out.print("\nDATA => "+ e.getValue()));
		
		return carrosMain;
		
	}
	

}
