package main;


import definition.ListOfContacts;
import definition.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListOfContacts listOfContactsObj = new ListOfContacts();
        String contactFirstName;
        String contactLastName;
        String[] contactNumber = new String[5];
        String emailOfContact = new String();
        boolean ctr;
        while (ctr = true) {
            System.out.println("Welcome to  Contact Application");
            System.out.println("Press 1 to add a new contact\n"
                    + "Press 2 to view all contacts\n"
                    + "Press 3 to search for a contact\n"
                    + "Press 4 to delete a contact\n"
                    + "Press 5 to exit ContactApp ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(" Add a new contact: \n" + "Please enter the name of the Person");
                    System.out.println("First Name:");
                    contactFirstName = scanner.nextLine();
                    System.out.println("Last Name:");
                    contactLastName = scanner.nextLine();
                    listOfContactsObj.setName(contactFirstName, contactLastName);
                    listOfContactsObj.setFirstNameInList(contactFirstName);
                    System.out.println("Contact Number:");
                    contactNumber[0] = scanner.nextLine();
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Would you like to add another contact number?");
                        char response = scanner.next().charAt(0);
                        if (response == 'y') {
                            contactNumber[i] = scanner.next();
                        } else {
                            break;
                        }
                    }
                    System.out.println("Email Address:");
                    emailOfContact = scanner.next();
                    Person person = new Person(contactFirstName, contactLastName, contactNumber, emailOfContact);
                    listOfContactsObj.addContact(person);
                    break;
                case 2:
                    listOfContactsObj.viewContacts();
                    break;
                case 3:
                    System.out.println("Search for a contact using first name ");
                    String name = scanner.next();
                    listOfContactsObj.searchInContacts(name);
                    break;
                case 4:
                    for (int i = 0; i < listOfContactsObj.getArrayOfFirstName().size(); i++) {
                        System.out.println((i + 1) + ". " + listOfContactsObj.getArrayOfFirstName().get(i));
                    }
                    System.out.println("Press the number against the contact to delete it: ");
                    int number = scanner.nextInt();
                    String temp = listOfContactsObj.getArrayOfFirstName().get(number - 1).toString();
                    listOfContactsObj.deleteFromContacts(number);
                    System.out.println(temp + "'s contact deleted from list!");
                    break;
                case 5:
                    System.out.println("Quitted Succesfully");
                    ctr = false;
                    break;
                default:
                    System.out.println("Please Enter a Valid Input");
                    break;

            }
        }
    }
}