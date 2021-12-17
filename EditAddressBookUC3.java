package com.bl.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class EditAddressBookUC3 {
	public void add (String firstName, String lastName, String houseNumber, String city, String state, String zipCode, String phoneNumber, String emailId) {
		ArrayList<String> list = new ArrayList<String>();
		

		list.add(firstName);
		list.add(lastName);
		list.add(houseNumber);
		list.add(city);
		list.add(state);
		list.add(zipCode);
		list.add(phoneNumber);
		list.add(emailId);
		 
		for(String address : list) {
			System.out.println("existing Address book"+list);
			Scanner sc = new Scanner(System.in);
			String firstName1 = sc.next();
			System.out.println("enter the new first name");
			list.set(1, firstName);
			System.out.println("edited successful");
		}
		System.out.println("new Addressbook"+list);
		
	
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		System.out.println("Enter housenumber");
		String houseNumber = sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter State");
		String state = sc.next();
		System.out.println("Enter zip code");
		String  zipCode = sc.next();
		System.out.println("Enter phone number");
		String phoneNumber = sc.next();
		System.out.println("Enter EmailID");
		String emailId = sc.next();
		sc.close();
		EditAddressBookUC3 edit = new EditAddressBookUC3();
		edit.add(firstName, lastName, houseNumber, city, state, zipCode, phoneNumber, emailId);
		
	}

}
