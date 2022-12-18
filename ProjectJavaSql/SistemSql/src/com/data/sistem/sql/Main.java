package com.data.sistem.sql;


import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.data.userTrabajadores.Trabajadores;
import com.data.userTrabajadores.CarrosUser;
import com.data.userTrabajadores.Person;

public class Main {

	protected static Scanner input = new Scanner(System.in);
	
	public static void methodAutos() {
		Map<Integer, MapsCarsT> addAutoNew = new HashMap<>();
		addAutoNew.put(1, new MapsCarsT("CHEVROLET", "ROJO", "P7181-66"));
		addAutoNew.put(2, new MapsCarsT("TOYOTA", "NEGRO-AZUL", "P98182-6"));
		
		addCars(addAutoNew);
		
	}

	
	public static void main(String[] args) {
		inicioProgram();
	}
	
	public static void carrosNVenta(List<?> vehiculesR) {
		for(Object p : vehiculesR) {
			System.out.println(p);
		}
	}
	

	
	public static void inicioProgram() {
		int levelS;
		int options2;
		try {
			System.out.print("1- CREA UNA NUEVA CUENTA" 
		    + "\n2- CONSULTE TRABAJADORES" + "\t3- CONSULTA VEHICULOS" + "\n4- CONSULTA VEHICULOS EN VENTA");
			System.out.print("\nINGRESE UNA OPCIÓN: ");
			levelS = input.nextInt();
			switch(levelS) {
			case 1: systemIntro();
			        break;
			
			case 2: 
				outPerson(Trabajadores.userTrabajador());
			    System.out.print("QUIERES CONSULTAR LOS AUTOS DE LOS TRABAJADORES Y(1) o (2)N: ");
			    options2 = input.nextInt();
			    if(options2 == 1) {
			    	CarrosUser.userCarros();
			    }else {
			    	System.exit(1); 
	
			    }
			case 3: carrosNVenta(CarrosVenta.dataCarros());
			case 4: methodAutos();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
    public static void methodUpdate(String userName, String userEmail, String sendPass) throws UnsupportedEncodingException {   	
    	String sendingEncode = Base64.getEncoder().encodeToString(sendPass.getBytes("UTF-8"));
		try {
			final Data dataN = new Data(userName, userEmail, sendingEncode);
			
			
			SQLConnect.sistemIntro(dataN);
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}

	    

    }

    static void systemIntro() {
    	String userName;
    	String userEmail;
    	String passUser;
    	try {
            System.out.print("NUEVO USUARIO: ");
    	    userName = input.next();
            System.out.print("NUEVO EMAIL: ");
    	    userEmail = input.next();
    	    System.out.print("NUEVA CONTRASEÑA: ");
    	    passUser = input.next();
    	    methodUpdate(userName, userEmail, passUser);
    	}catch(Exception e) {
    	    e.printStackTrace();
    	}

    }
    
    public static void outPerson(List<Person> personName) {
    	for(Person x : personName) {
    		System.out.println(x);
    	}
    }
    
   	public static void addCars(Map<Integer, MapsCarsT> addAutoNew) {
   		for(Map.Entry<Integer,MapsCarsT> p : addAutoNew.entrySet()) {
   			System.out.println(addAutoNew.values());
   		}
   		
   		int carsSend;
   		System.out.println("QUIERES CONDUCIR UN CARRO? ");
   		carsSend = input.nextInt();
   	    final MapsCarsT addData = new MapsCarsT(addAutoNew.get(carsSend));
   	    addData.mainInice();
   	    

   	}

}
