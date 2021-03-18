import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = sc.nextLine();
        System.out.println("Enter Last Name");
        String last = sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter City");
        String city = sc.nextLine();
        System.out.println("Enter State");
        String state = sc.nextLine();
        System.out.println("Enter Zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter Phone Number");
        long phone = sc.nextLong();
        System.out.println("Enter E-mail");
        String email = sc.next();
        Contact contact = new Contact(first, last, address, city, state, zip, phone, email);
        contacts.add(contact);
        System.out.println("Contact added Successfully");
    }

    public static void main (String [] args) {
        System.out.println("-----Welcome to Address Book Program-----");
        AddressBook addressbook = new AddressBook();
        addressbook.addContact();
    }

}
