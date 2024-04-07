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
        BaseballPlayer firstPlayer = new BaseballPlayer("Elmer Fudd", "Pitcher");
        BaseballPlayer secondPlayer = new BaseballPlayer("Bugs Bunny", "Catcher");
        BaseballPlayer thirdPlayer = new BaseballPlayer("Daffy Duck", "First Base");
        BaseballPlayer fourthPlayer = new BaseballPlayer("Foghorn Leghorn", "Short Stop");

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
}
