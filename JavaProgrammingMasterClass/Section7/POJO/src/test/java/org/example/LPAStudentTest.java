package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LPAStudentTest {
    /*
        This is an introduction to Java Records.  The key difference between a Record and a POJO is
        that data for the Record is immutable.  So the data is initially set by the Record call and
        then the only methods supplied to the Record are toString and what are essentially Getters.
        As we will see the Getter call on a Record is different from the POJO.
    */

  private LPAStudent lpaStudent;
  private String expected;

   @BeforeEach
    public void setUp() {
       lpaStudent = new LPAStudent("xyz123", "Elmer Fudd",
               "12/20/2023", "Java Masterclass");
   }

   @Test
    public void testLPAStudentToString() {
       expected = "LPAStudent[id=xyz123, name=Elmer Fudd," +
               " dateOfBirth=12/20/2023, classList=Java Masterclass]";
       Assertions.assertEquals(
               expected,
               lpaStudent.toString()
       );
   }
}
