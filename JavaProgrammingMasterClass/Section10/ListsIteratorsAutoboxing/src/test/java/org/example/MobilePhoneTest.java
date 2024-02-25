package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MobilePhoneTest {

    private MobilePhone mobilePhone;
    private Contact contact;
    String[] expected, results;

    @BeforeEach
    public void setUp() {
        mobilePhone = new MobilePhone("9194495529");
        mobilePhone.addNewContact(new Contact("Elmer Fudd", "7034510235"));
        mobilePhone.addNewContact(new Contact("Bugs Bunny", "7035531295"));
        mobilePhone.addNewContact(new Contact("Daffy Duck", "7037619385"));
        mobilePhone.addNewContact(new Contact("Foghorn Leghorn", "7035537844"));
        mobilePhone.addNewContact(new Contact("Yosemite Sam", "7034512299"));
    }

    @Test
    public void testAddNewContact() {
        contact = new Contact("Speedy Gonzales", "7034514976");
        Assertions.assertTrue(mobilePhone.addNewContact(contact));
    }

    @Test
    public void testCannotAddDuplicateContact() {
        contact = new Contact("Daffy Duck", "9993351234");
        Assertions.assertFalse(mobilePhone.addNewContact(contact));
    }

    @Test
    public void testQueryContactWhenContactExists() {
        contact = mobilePhone.queryContact("Bugs Bunny");
        expected = new String[]{"Bugs Bunny", "7035531295"};
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
        Contact newContact = new Contact("Henry Hawk", "7033432839");
        Assertions.assertTrue(mobilePhone.updateContact(contact, newContact));
    }

    @Test
    public void testUpdateNonExistingContact() {
        contact = new Contact("Gossamer", "7038979876");
        Contact newContact = new Contact("Henry Hawk", "7033432839");
        Assertions.assertFalse(mobilePhone.updateContact(contact, newContact));
    }

    @Test
    public void testRemoveExistingContact() {
        contact = mobilePhone.queryContact("Daffy Duck");
        Assertions.assertTrue(mobilePhone.removeContact(contact));
    }

    @Test
    public void testRemoveNonExistingContact() {
        contact = new Contact("Henry Hawk", "7033432839");
        Assertions.assertFalse(mobilePhone.removeContact(contact));
    }

    @Test
    public void testPrintContacts() {
        String expected =
                "Contact List:\n" + "1. Elmer Fudd -> 7034510235\n" +
                        "2. Bugs Bunny -> 7035531295\n" + "3. Daffy Duck -> 7037619385\n" +
                        "4. Foghorn Leghorn -> 7035537844\n" + "5. Yosemite Sam -> 7034512299\n";
        String results = mobilePhone.printContacts();
        Assertions.assertEquals(expected, results);
    }

}
