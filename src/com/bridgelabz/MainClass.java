package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        HashMap<String, AddressBook> map = new HashMap<>();

        AddressBook familyAddressBook = new AddressBook();
        AddressBook friendsAddressBook = new AddressBook();
        AddressBook relativesAddressBook = new AddressBook();

        map.put("Family", familyAddressBook);
        map.put("Friends", friendsAddressBook);
        map.put("Relatives", familyAddressBook);

        while (true) {
            System.out.println("1: Family Address Book \n" + "2: Friend Address Book \n"
                    + "3: Relatives Address Book \n" + "4: Terminate the program");
            Scanner scanner = new Scanner(System.in);
            int selectedOption = scanner.nextInt();
            if (selectedOption == 1) {
                familyAddressBook.getUserChoice();
            } else if (selectedOption == 2) {
                friendsAddressBook.getUserChoice();
            } else if (selectedOption == 3) {
                relativesAddressBook.getUserChoice();
            }
            else{
                System.out.println("Terminate the program");
                break;
            }
        }
    }
}
