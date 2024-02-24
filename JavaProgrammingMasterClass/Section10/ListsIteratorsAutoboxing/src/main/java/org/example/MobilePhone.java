package org.example;

import java.util.ArrayList;

public class MobilePhone {

    private final String myNumber;
    private final ArrayList<Contact> myContacts;

    private boolean sameContact(Contact firstContact, Contact secondContact) {
        return firstContact.getName().equals(secondContact.getName());
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact.getName());
    }

    private int findContact(String name) {
        return this.myContacts.indexOf(name);
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

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
}
