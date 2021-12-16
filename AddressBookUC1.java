package com.bl.AddressBook;

import java.util.Scanner;

public class AddressBookUC1 {
	public static void contacts() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		System.out.println("Enter housenumber");

		int houseNumber = sc.nextInt();
		System.out.println("Enter address");
		String address = sc.next();
		System.out.println("Enter State");
		String state = sc.next();
		System.out.println("Enter zip code");
		int  zip = sc.nextInt();
		System.out.println("Enter phone number");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter EmailID");
		String emailID = sc.next();
		sc.close();
		System.out.println("==============================================================");
		System.out.println(" First name : "+firstName+"\n LastName :"+lastName+"\n House Number :"+houseNumber+"\n Address : "+address+"\n State :"+state+"\n zip : "+zip+"\n Phone number :"+phoneNumber+"\n Email ID :"+emailID);

	}
	public static void main(String[] args) {
		System.out.println("welcome to AddressBook");
		contacts();
	}
}



