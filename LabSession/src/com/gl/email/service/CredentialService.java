package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService {

	public char[] generatepassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmaopqrstuvwxyz";
		String number = "0123456789";
		String special = "!@#$%^&*()_+";
		String bigString = caps+lowerCase+number+special; 
		Random random = new Random();
		char [] password = new char[8];
		for (int i=0; i<8;i++) {
			password[i]= bigString.charAt(random.nextInt(bigString.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String department){
		return firstName+lastName+"@"+department+"gl.com";
		
	}
	public void showCredentials(Employee Emp, String email, char[] password) {
		      System.out.println("Dear"+Emp.getFirstName()+"Your generated credentials are as follows");
		      System.out.println("Email --->"+email);
		      System.out.println("Password --->"+password);
	}
}
