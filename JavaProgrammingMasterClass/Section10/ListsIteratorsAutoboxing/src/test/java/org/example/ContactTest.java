package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactTest {

    private Contact contact;
    private final String name = "Elmer Fudd", phoneNumber = "919-449-1266";

    @BeforeEach
    public void setUp() {
        contact = Contact.createContact(name, phoneNumber);
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals(name, contact.getName());
    }

    @Test
    public void testGetPhoneNumber() {
        Assertions.assertEquals(phoneNumber, contact.getPhoneNumber());
    }
}
