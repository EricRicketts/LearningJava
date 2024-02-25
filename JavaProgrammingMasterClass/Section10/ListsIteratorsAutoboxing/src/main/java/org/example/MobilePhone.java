package org.example;

import java.util.ArrayList;

public class MobilePhone {

    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    private int findContact(Contact contact) {
        for (int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = myContacts.get(index);
            if (contact.getName().equals(currentContact.getName())) return index;
        }
        return -1;
    }

    private int findContact(String name) {
        for (int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = myContacts.get(index);
            if (name.equals(currentContact.getName())) return index;
        }
        return -1;
    }

    public boolean addNewContact(Contact newContact) {
        boolean contactExists = false;
        for (Contact currentContact : myContacts) {
            if (currentContact.getName().equals(newContact.getName())) {
                contactExists = true;
                break;
            }
        }
        if (!contactExists) {
            myContacts.add(newContact);
            return true;
        } else {
            return false;
        }
    }

    public String printContacts() {
        String contactList = "Contact List:\n";
        for (int index = 0; index < myContacts.size(); index++) {
            Contact contact = myContacts.get(index);
            String numericPosition = Integer.toString(index + 1) + ". ";
            contactList = String.join("",
                    contactList, numericPosition, contact.getName(), " -> ", contact.getPhoneNumber(), "\n");
        }
        return contactList;
    }

    public Contact queryContact(String name) {
        int searchResult = this.findContact(name);
        return (searchResult < 0) ? null : myContacts.get(searchResult);
    }

    public boolean removeContact(Contact contact) {
        for (int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = this.myContacts.get(index);
            if (contact.getName().equals(currentContact.getName())) {
                this.myContacts.remove(index);
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        for(int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = this.myContacts.get(index);
            if (oldContact.getName().equals(currentContact.getName())) {
                this.myContacts.set(index, newContact);
                return true;
            }
        }
        return false;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
}
