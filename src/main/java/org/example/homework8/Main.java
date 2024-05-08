package org.example.homework8;
import org.example.homework8.Contact;
import org.example.homework8.MobilePhone;
public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = Contact.createContact("Tom", "98563254");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("John", "8887845412");
        Contact contact4 = Contact.createContact("Mike", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();

        Contact contactToUpdate = mobilePhone.queryContact("Bob");
        if (contactToUpdate != null) {
            Contact updatedContact = Contact.createContact("Robert", "12345678");
            mobilePhone.updateContact(contactToUpdate, updatedContact);
        }

        mobilePhone.printContacts();

        Contact contactToRemove = mobilePhone.queryContact("Alice");
        if (contactToRemove != null) {
            mobilePhone.removeContact(contactToRemove);
        }

        mobilePhone.printContacts();
    }
}