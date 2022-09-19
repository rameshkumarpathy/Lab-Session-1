package com.gl.email.application;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;

public class Application {
public static void main(String[] args) {
	Employee employee = new Employee("Ramesh", "Kumar");
	CredentialService cs = new CredentialService();
	String generatedEmail;
	char[] generatedPassword;
	System.out.println("Please enter the department from the following ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	Scanner sc = new Scanner(System.in);
	
	int input = sc.nextInt();
	switch (input) {
	case 1:
		{generatedEmail= cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
		generatedPassword = cs.generatepassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);}
		break;
	case 2:	
		{generatedEmail= cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "adm");
		generatedPassword = cs.generatepassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);}
		break;
	case 3:
		{generatedEmail= cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
		generatedPassword = cs.generatepassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);}
		break;
	case 4:
		{generatedEmail= cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
		generatedPassword = cs.generatepassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);}
	
	
}
}
	
}

