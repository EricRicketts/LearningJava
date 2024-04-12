package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballTeamTest {

    private List<String> expectedList, resultsList;
    private String expected, results;
    BaseballTeam  firstTeam;
    BaseballTeam  secondTeam;

    @BeforeEach
    public void setUp() {
        BaseballPlayer firstPlayer = new BaseballPlayer(
                "Elmer Fudd", "Pitcher", 0.200
        );
        BaseballPlayer secondPlayer = new BaseballPlayer(
                "Bugs Bunny", "Catcher", 0.250
        );
        BaseballPlayer thirdPlayer = new BaseballPlayer(
                "Daffy Duck", "First Base", 0.275
        );
        BaseballPlayer fourthPlayer = new BaseballPlayer(
                "Foghorn Leghorn", "Short Stop", 0.280
        );

        firstTeam = new BaseballTeam("Oriels");
        secondTeam = new BaseballTeam("Blue Jays");

        firstTeam.addTeamMember(firstPlayer);
        firstTeam.addTeamMember(secondPlayer);
        secondTeam.addTeamMember(thirdPlayer);
        secondTeam.addTeamMember(fourthPlayer);
    }

    @Test
    public void testFirstTeamMembers() {
        expected = "Oriels Roster:\n" +
        "Name: Elmer Fudd Position: Pitcher\n" +
        "Name: Bugs Bunny Position: Catcher\n";
        results = firstTeam.listTeamMembers();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testSecondTeamMembers() {
        expected = "Blue Jays Roster:\n" +
                "Name: Daffy Duck Position: First Base\n" +
                "Name: Foghorn Leghorn Position: Short Stop\n";
        results = secondTeam.listTeamMembers();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testGetTeamNames() {
        expectedList = Arrays.asList("Oriels", "Blue Jays");
        resultsList = Arrays.asList(firstTeam.getTeamName(), secondTeam.getTeamName());
        Assertions.assertEquals(expectedList, resultsList);
    }

    @Test
    public void testAddTeamMember() {
        BaseballPlayer fifthPlayer = new BaseballPlayer(
                "Tweety Bird", "Second Base", 0.239
        );
        BaseballPlayer sixthPlayer = new BaseballPlayer(
                "Yosemite Sam", "Third Base", 0.225
        );
        int[] expectedSizes = new int[]{2, 3};
        int[] resultantSizes = new int[4];
        // before adding a team member
        resultantSizes[0] = firstTeam.getTeamMembers().size();
        resultantSizes[1] = secondTeam.getTeamMembers().size();

        // add team member
        firstTeam.addTeamMember(fifthPlayer);
        secondTeam.addTeamMember(sixthPlayer);

        // after adding a team member
        resultantSizes[2] = firstTeam.getTeamMembers().size();
        resultantSizes[3] = secondTeam.getTeamMembers().size();

        // assertions firstTeam
        int[] results = new int[]{resultantSizes[0], resultantSizes[2]};
        Assertions.assertArrayEquals(expectedSizes, results);
        // assertions secondTeam
        results = new int[]{resultantSizes[1], resultantSizes[3]};
        Assertions.assertArrayEquals(expectedSizes, results);
    }

    @Test
    public void testFirstTeamSetScoreAndTeamRanking() {
        // the pairs to be used for the setScore method in order of parameters: ourScore, theirScore
        // below is the expected result for each pair of scores
        int[][] scores = new int[][]{{2, 1}, {3, 2}, {4, 5}, {3, 3}};
        String[] scoreResults = new String[]{"beat", "beat", "lost to", "tied"};

        for (int index = 0; index < scoreResults.length; index++) {
            // get the expected score result
            String expected = scoreResults[index];
            // get the parameters for the call to setScore
            int ourScore = scores[index][0];
            int theirScore = scores[index][1];
            // call setScore and assert on the results
            String results = firstTeam.setScore(ourScore, theirScore);
            Assertions.assertEquals(expected, results);
        }
        // ranking = (2 * losses) + ties + 1 = (2 * 1) + 1 + 1 = 4
        Assertions.assertEquals(4, firstTeam.ranking());
    }

    @Test
    public void testSecondTeamSetScoreAndTeamRanking() {
        // the pairs to be used for the setScore method in order of parameters: ourScore, theirScore
        // below is the expected result for each pair of scores
        int[][] scores = new int[][]{{1, 2}, {2, 3}, {5, 4}, {3, 3}};
        String[] scoreResults = new String[]{"lost to", "lost to", "beat", "tied"};

        for (int index = 0; index < scoreResults.length; index++) {
            // get the expected score result
            String expected = scoreResults[index];
            // get the parameters for the call to setScore
            int ourScore = scores[index][0];
            int theirScore = scores[index][1];
            // call setScore and assert on the results
            String results = secondTeam.setScore(ourScore, theirScore);
            Assertions.assertEquals(expected, results);
        }
        // ranking = (2 * losses) + ties + 1 = (2 * 2) + 1 + 1 = 6
        Assertions.assertEquals(6, secondTeam.ranking());
    }
}
