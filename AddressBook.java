package com.bl.AddressBookUC4;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
	ArrayList<DeleteContacts> arrayDetails = new ArrayList<DeleteContacts>();
	static Scanner sc = new Scanner(System.in);

	public void addDetails() {
		DeleteContacts info = new DeleteContacts();
		System.out.println("Enter first name");
		info.setFirstName(sc.next());
		System.out.println("Enter Last name");
		info.setLastName(sc.next());
		System.out.println("Enter housenumber");
		info.setHouseNumber(sc.next());
		System.out.println("Enter city");
		info.setCity(sc.next());
		System.out.println("Enter state");
		info.setState(sc.next());
		System.out.println("Enter zip code");
		info.setZipcode(sc.next());
		System.out.println("Enter phone number");
		info.setPhoneNumber(sc.next());
		System.out.println("Enter emailId");
		info.setEmailID(sc.next());
		arrayDetails.add(info);
		System.out.println(arrayDetails);
	}
	public void editDetails() {
		System.out.println("confirm with your name");
		String confirmName = sc.next();

		for (int i = 0; i < arrayDetails.size(); i++) {
			if (arrayDetails.get(i).getFirstName().equals(confirmName)) {
				System.out.println("Select option to edit \t");
				System.out.println("\n1.FirstName\n2.LastName\n3.HouseNumber\n4.city\nState\5.ZipCode\n6.PhoneNumber\n7.EmailID");
				int edit = sc.nextInt();

				switch(edit) {
				case 1:
					System.out.println("enter First Name");
					arrayDetails.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("enter Last Name");
					arrayDetails.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("enter House Number");
					arrayDetails.get(i).setHouseNumber(sc.next());
					break;
				case 4:
					System.out.println("enter City");
					arrayDetails.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("enter state");
					arrayDetails.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("enter ZipCode");
					arrayDetails.get(i).setZipcode(sc.next());
					break;
				case 7:
					System.out.println("enter PhoneNumber");
					arrayDetails.get(i).setPhoneNumber(sc.next());
					break;
				case 8:
					System.out.println("enter Email ID");
					arrayDetails.get(i).setEmailID(sc.next());
					break;
				default:
					break;

				}
				System.out.println("edited list :");
				System.out.println(arrayDetails);
			}else {
				System.out.println("enter valid input of firstname");
			}
		}
	}
	public void deleteDetails() {
		System.out.println("confirm with your first name by entering");
		String confirmName = sc.next();
		for (int i = 0; i < arrayDetails.size(); i++) {
			if(arrayDetails.get(i).getFirstName().equals(confirmName)) {
				arrayDetails.remove(i);
				System.out.println("List After removing"+arrayDetails);
			}else {
				System.out.println("entered name is invaild input");
			}
		}
	}
	public static void main(String[] args) {
		AddressBook details = new AddressBook();
		details.addDetails();
		int i = 0;
		while(i == 0) {
			System.out.println("Welcome to AddressBook");
			System.out.println("select task what you want to perform");
			System.out.println("\n1.add Details\n2.edit Details\n3.delete Details");
			int select = sc.nextInt();

			switch(select) {
			case 1:
				details.addDetails();
				break;
			case 2:
				details.editDetails();
				break;
			case 3:
				details.deleteDetails();
				break;
			default :
				break;
			}
		}
	}
}



