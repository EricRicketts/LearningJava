package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LPAStudentTest {

    QueryList<LPAStudent> queryList = new QueryList<>();

    @BeforeEach
    public void setUp() {
        for (int index = 0; index < 25; index++) queryList.add(new LPAStudent());
    }

    @Test
    public void testPercentGetPercentComplete() {
        for(var lpaStudent : queryList) {
            double percentComplete = lpaStudent.getPercentComplete();
            boolean checkPercentComplete =  percentComplete >= 0.00 && percentComplete < 100.001;
            assertTrue(checkPercentComplete);
        }
    }

    @Test
    public void testQueryListOfLPAStudentsPercentCompleteCutoff() {
        var matches = queryList.getMatches("PercentComplete", "50");
        if (!matches.isEmpty()) {
            for(LPAStudent lpaStudent : matches) {
                assertTrue(lpaStudent.getPercentComplete() <= 50.00);
            }
        }
    }

    @Test
    public void testQueryListOfLPAStudentsPercentCompleteCutoffAndTakingJavaCourse() {
        var matches = queryList
                .getMatches("PercentComplete", "50")
                .getMatches("Course", "Java");
        if (!matches.isEmpty()) {
            for(LPAStudent lpaStudent : matches) {
                assertTrue(lpaStudent.getPercentComplete() <= 50.00);
                assertEquals("Java", lpaStudent.getCourse());
            }
        }
    }

    /*
        write another test that sorts the matches by LPAComparator and then sorts by studentID
    */
}
