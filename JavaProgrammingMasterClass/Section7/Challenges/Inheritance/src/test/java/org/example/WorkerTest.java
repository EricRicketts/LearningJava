package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WorkerTest {

    private Worker worker;

    @BeforeEach
    public void setUp() {
        worker = new Worker("Elmer Fudd", "11/06/1937", "12/31/2030");
    }

    @Test
    public void testGetAndSetName() {
        String oldName = "Elmer Fudd";
        String newName = "Bugs Bunny";
        Assertions.assertEquals(oldName, worker.getName());
        worker.setName(newName);
        Assertions.assertEquals(newName, worker.getName());
    }
}
