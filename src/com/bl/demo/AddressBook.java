package com.bl.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Contact contact = new Contact();
		
		System.out.println("Enter First Name: ");
		String firstName = scanner.nextLine();
		contact.setFirstName(firstName);
		String resultPattern = "^[A-Za-z]{10}$";
		Pattern regex = Pattern.compile(resultPattern);
		
		Matcher inputMatcher = regex.matcher(firstName);
		System.out.println(inputMatcher.matches());
		System.out.println("Enter Your Email: ");
		String email = scanner.nextLine();
		contact.setEmail(email);
		
		System.out.println("Enter Phone Number: ");
		String phoneNumber = scanner.nextLine();
		contact.setPhoneNumber(phoneNumber);
		
		System.out.println(contact);
	}
}
