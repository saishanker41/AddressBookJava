import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public int indexValue = 1;
    public HashMap<Integer,Contact> contacts = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public void addContact(){
        System.out.println("Enter First Name");
        String first = sc.next();
        sc.nextLine();
        System.out.println("Enter Last Name");
        String last = sc.next();
        sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.next();
        sc.nextLine();
        System.out.println("Enter City");
        String city = sc.nextLine();
        System.out.println("Enter State");
        String state = sc.next();
        sc.nextLine();
        System.out.println("Enter Zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter Phone Number");
        long phone = sc.nextLong();
        System.out.println("Enter E-mail");
        String email = sc.next();
        Contact contact = new Contact(first, last, address, city, state, zip, phone, email);
        contacts.put(indexValue, contact);
        indexValue++;
        System.out.println("Contact added Successfully");
    }

    public void deleteContact() {

        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("Enter the first name to delete contact.");
            String name = sc.next();
            Iterator<Integer> itr = contacts.keySet().iterator();
            while(itr.hasNext()) {
                int key = itr.next();
                if (contacts.get(key).firstName.equals(name)) {
                    contacts.remove(key);
                    System.out.println("Contact deleted with first name : "+name);
                }
            }
        }
    }

    public static void main (String [] args) {
        System.out.println("-----Welcome to Address Book Program-----");

        int choice = 1;
        AddressBook addressbook = new AddressBook();
        do {
            System.out.println("Enter your choice\n1. Add contact\n2. Delete Contact\n3. Exit");
            int userInput = sc.nextInt();
            switch (userInput){
                case 1 :
                    addressbook.addContact();
                    break;
                case 2 :
                    addressbook.deleteContact();
                    break;
                default:
                    System.out.println("You press exit.\nThank You!");
                    choice = 0;
                    break;
            }
        }
            while(choice != 0);
        }

    }
