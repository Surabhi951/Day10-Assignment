package com.bridgelabz;

import java.util.HashMap;
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome in AddressBook Program");

        HashMap<String, AddressBook> map = new HashMap<>();
        AddressBook book = new AddressBook();

        while (true) {
            book.getUserChoice();
            break;
        }
    }
}
