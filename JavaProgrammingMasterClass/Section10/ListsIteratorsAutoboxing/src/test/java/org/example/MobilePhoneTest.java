package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MobilePhoneTest {

    private MobilePhone mobilePhone;
    private Contact contact;
    String[] expected, results;

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

    @Test
    public void testQueryContactWhenContactExists() {
        contact = mobilePhone.queryContact("Bugs Bunny");
        expected = new String[]{"Bugs Bunny", "703-553-1295"};
        results = new String[]{contact.getName(), contact.getPhoneNumber()};

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testQueryContactWhenNoContactExists() {
        contact = mobilePhone.queryContact("Henry Hawk");
        Assertions.assertNull(contact);
    }

    @Test
    public void testUpdateExistingContact() {
        contact = mobilePhone.queryContact("Foghorn Leghorn");
        Contact newContact = new Contact("Henry Hawk", "703-343-2839");
        Assertions.assertTrue(mobilePhone.updateContact(contact, newContact));
    }

    @Test
    public void testUpdateNonExistingContact() {
        contact = new Contact("Gossamer", "703-897-9876");
        Contact newContact = new Contact("Henry Hawk", "703-343-2839");
        Assertions.assertFalse(mobilePhone.updateContact(contact, newContact));
    }

    @Test
    public void testRemoveExistingContact() {
        contact = mobilePhone.queryContact("Daffy Duck");
        Assertions.assertTrue(mobilePhone.removeContact(contact));
    }

    @Test
    public void testRemoveNonExistingContact() {
        contact = new Contact("Henry Hawk", "703-343-2839");
        Assertions.assertFalse(mobilePhone.removeContact(contact));
    }
}
