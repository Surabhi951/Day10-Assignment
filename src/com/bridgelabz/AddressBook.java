package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    HashMap<String, ContactPerson> map = new HashMap<>();

    Scanner scanner = new Scanner(System.in);
    static AddressBook book = new AddressBook();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        book.getUserChoice();
    }

    private ContactPerson getUserInput() {

        System.out.print("Enter FirstName:");
        String FirstName = scanner.next();

        System.out.println("Enter LastName: ");
        String LastName = scanner.next();

        System.out.print("Enter Address: ");
        String Address = scanner.next();

        System.out.print("Enter City: ");
        String City = scanner.next();

        System.out.print("Enter State: ");
        String State = scanner.next();

        System.out.print("Enter ZipCode: ");
        String ZIPCode = scanner.next();

        System.out.print("Enter Mobile Number: ");
        String MobileNo = scanner.next();

        System.out.println("Enter Email Id:");
        String emailId = scanner.next();

        ContactPerson person = new ContactPerson();
        person.setFirstName(FirstName);
        person.setLastName(LastName);
        person.setAddress(Address);
        person.setCity(City);
        person.setZIPCode(ZIPCode);
        person.setState(State);
        person.setMobileNo(MobileNo);
        person.setEmailId(emailId);
//        System.out.println(person);
        return person;
    }

    public void getUserChoice() {
        boolean isTerminate = false;
        while (!isTerminate) {
            System.out.println("1:Adding new person \n" + "2:Print address book \n" + "3:Update the person details \n "
                    + "4:Delete the person \n" + "5:Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    ContactPerson person = book.getUserInput();
                    map.put(person.getEmailId(), person);
                    break;

                case 2:
                    System.out.println(map);
                    break;

                case 3:
                    isTerminate = true;
                    break;

                default:
                    System.out.println("please select valid option");
                    break;
            }
        }
    }
}
