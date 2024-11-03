package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LPAStudentTest {

    private LPAStudent[] individualLPAStudents = new LPAStudent[10];

    @BeforeEach
    public void setUp() {
        for (int index = 0; index < 10; index++) {
            this.individualLPAStudents[index] = new LPAStudent();
        }
    }

    @Test
    public void testPercentGetPercentComplete() {
        for(var individualLPAStudent : individualLPAStudents) {
            double percentComplete = individualLPAStudent.getPercentComplete();
            boolean checkPercentComplete =  percentComplete >= 0.00 && percentComplete < 100.001;
            assertTrue(checkPercentComplete);
        }
    }
}
