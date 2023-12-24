package org.example;

import org.junit.jupiter.api.BeforeEach;

public class WorkerTest {

    private Worker worker;

    @BeforeEach
    public void setUp() {
        worker = new Worker("Elmer Fudd", "11/06/1937", "12/31/2030");
    }
}
