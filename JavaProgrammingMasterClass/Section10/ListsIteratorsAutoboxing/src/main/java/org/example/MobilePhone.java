package org.example;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    private boolean sameContact(Contact contact, Contact currentContact) {
        return contact.getName().equals(currentContact.getName());
    }

    private boolean sameContact(String contactName, Contact currentContact) {
        return contactName.equals(currentContact.getName());
    }

    private int findContact(Contact contact) {
        for (int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = myContacts.get(index);
            if (this.sameContact(contact, currentContact)) return index;
        }
        return -1;
    }

    private int findContact(String name) {
        for (int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = myContacts.get(index);
            if (this.sameContact(name, currentContact)) return index;
        }
        return -1;
    }

    public boolean addNewContact(Contact newContact) {
        boolean contactExists = false;
        for (Contact currentContact : myContacts) {
            if (this.sameContact(currentContact, newContact)) {
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

    public Contact queryContact(String name) {
        int searchResult = this.findContact(name);
        return (searchResult < 0) ? null : myContacts.get(searchResult);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        for(int index = 0; index < myContacts.size(); index++) {
            Contact currentContact = this.myContacts.get(index);
            if (this.sameContact(currentContact, oldContact)) {
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
