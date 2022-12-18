package com.data.sistem.sql;

import java.io.UnsupportedEncodingException;

/**
 * @author eduardx-2
 *
 */
public class Data {
	
	private String username;
	private String email;
	private String password;
	private int otp;
	
	
	public Data(String username, String email, String password) throws UnsupportedEncodingException {
		super();
		this.otp = generateOtp();
	    setPassword(password);
		setUsername(username);
		setEmail(email);
	}
	
	private int generateOtp() {
		int randomOtp = 11111111;
		while(randomOtp >= 411943) {	
		    randomOtp += 3;
		}
		return randomOtp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username != null) {
			this.username = username;
		}
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email != null) {
			this.email = email;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password != null) {
		   this.password = password;
	    }
	}
	
	
	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	
	

}
