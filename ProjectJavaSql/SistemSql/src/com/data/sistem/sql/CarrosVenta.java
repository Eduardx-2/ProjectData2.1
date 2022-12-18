package com.data.sistem.sql;

import java.util.ArrayList;

public class CarrosVenta {
	
	static ArrayList<CarrosData> dataCarros() {
		ArrayList<CarrosData> autoTk = new ArrayList<>();
		autoTk.add(new CarrosData("TOYOTA", "VERDE", 1990));
		autoTk.add(new CarrosData("TOYOTA", "ROJO", 1980));
		autoTk.add(new CarrosData("CHEVROLET", "NARANJA", 2001));
		autoTk.add(new CarrosData("MAZDA", "AZUL", 2004));
		
		return autoTk;
	}


}
