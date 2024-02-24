package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MobilePhoneTest {

    private MobilePhone mobilePhone;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        mobilePhone = new MobilePhone("919-449-5529");
        mobilePhone.addNewContact(new Contact("Elmer Fudd", "703-451-0235"));
        mobilePhone.addNewContact(new Contact("Bugs Bunny", "703-553-1295"));
        mobilePhone.addNewContact(new Contact("Daffy Duck", "703-761-9385"));
        mobilePhone.addNewContact(new Contact("Foghorn Leghorn", "703-553-7844"));
        mobilePhone.addNewContact(new Contact("Yosemite Sam", "703-451-2299"));
    }

    @Test
    public void testAddNewContact() {
        contact = new Contact("Speedy Gonzales", "703-451-4976");
        Assertions.assertTrue(mobilePhone.addNewContact(contact));
    }

    @Test
    public void testCannotAddDuplicateContact() {
        contact = new Contact("Daffy Duck", "999-335-1234");
        Assertions.assertFalse(mobilePhone.addNewContact(contact));
    }
}
