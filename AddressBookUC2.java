package com.bl.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC2 {

	public void contact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		System.out.println("Enter housenumber");
		String houseNumber = sc.next();
		System.out.println("Enter city");
		String address = sc.next();
		System.out.println("Enter State");
		String state = sc.next();
		System.out.println("Enter zip code");
		String  zip = sc.next();
		System.out.println("Enter phone number");
		String phoneNumber = sc.next();
		System.out.println("Enter EmailID");
		String emailID = sc.next();
		sc.close();

		ArrayList<String> list = new ArrayList<String>();
		list.add(firstName);
		list.add(lastName);
		list.add(houseNumber);
		list.add(address);
		list.add(state);
		list.add(zip);
		list.add(phoneNumber);
		list.add(emailID);

		Object[] a = list.toArray();
		for(Object obj:a) {
			
			System.out.println(obj);
			System.out.println("-------------------------");
		}
	}
}

