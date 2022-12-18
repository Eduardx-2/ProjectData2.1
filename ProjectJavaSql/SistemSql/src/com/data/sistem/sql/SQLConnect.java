package com.data.sistem.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLConnect {
	
	
	private static Connection sqlS = null;
	
	private static Connection dataSql() {
		final String URL = "jdbc:sqlite:/root/SQL/loginSys.db";
		try {
			sqlS = DriverManager.getConnection(URL);
			if(sqlS != null) {
				System.out.println("COMPLETADO");
		
			    
			}else {
				System.out.println("false");
				sqlS.close();
			}
		}catch(Exception e) {
			System.out.printf("Ocurrio un error %s",e);
		}
     	return sqlS;
		
		
	}
	   
	
	public static void sistemIntro(Data dataN) {
		String insertSql = "INSERT INTO login VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement sqlInsertData = dataSql().prepareStatement(insertSql);	
	        sqlInsertData.setString(1, dataN.getUsername());
	        sqlInsertData.setString(2, dataN.getEmail());
	        sqlInsertData.setString(3, dataN.getPassword());
	        sqlInsertData.setLong(4, dataN.getOtp());
	        
	        sqlInsertData.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
