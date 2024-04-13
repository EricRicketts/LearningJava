package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    private Team<BaseballPlayer> baseballTeam;
    private Team<BasketballPlayer> basketballTeam;

    @BeforeEach
    public void setUp() {
        baseballTeam = new Team<>("Toronto Blue Jays");
        basketballTeam = new Team<>("Dallas Mavericks");

        BaseballPlayer firstBaseballPlayer = new BaseballPlayer(
                "George Chelston Springer",
                "Right Fielder",
                0.266
        );
        BaseballPlayer secondBaseballPlayer = new BaseballPlayer(
                "Bo Joseph Bichette",
                "Short Stop",
                0.297
        );
        BasketballPlayer firstBasketballPlayer = new BasketballPlayer(
                "Luka Doncic",
                "Point Guard",
                28.7
        );
        BasketballPlayer secondBasketballPlayer = new BasketballPlayer(
                "Dirk Nowitzki",
                "Power Forward",
                20.7
        );

        baseballTeam.addTeamMember(firstBaseballPlayer);
        baseballTeam.addTeamMember(secondBaseballPlayer);

        basketballTeam.addTeamMember(firstBasketballPlayer);
        basketballTeam.addTeamMember(secondBasketballPlayer);

        int[][] baseballScores = {{3, 2}, {4, 1}, {2, 5}, {1, 3}, {2, 2}, {1, 1}};
        for (int[] gameScore : baseballScores) {
            int ourScore = gameScore[0];
            int theirScore = gameScore[1];
            baseballTeam.setScore(ourScore, theirScore);
        }
        int[][] basketballScores = {{90, 100}, {102, 88}, {92, 85}, {101, 93}, {102, 92}, {101, 101}};
        for (int[] gameScore : basketballScores) {
            int ourScore = gameScore[0];
            int theirScore = gameScore[1];
            basketballTeam.setScore(ourScore, theirScore);
        }
    }

    @Test
    public void testNumberOfTeamMembers() {
        int[] expected = {2, 2};
        int[] results = {
                baseballTeam.getTeamMembers().size(),
                baseballTeam.getTeamMembers().size()
        };
        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testListBaseballTeamMembers() {
        String expected = "Toronto Blue Jays Roster:\n" +
            "BaseballPlayer[name=George Chelston Springer, position=Right Fielder, battingAverage=0.266]\n" +
            "BaseballPlayer[name=Bo Joseph Bichette, position=Short Stop, battingAverage=0.297]\n";
        String results = baseballTeam.listTeamMembers();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testListBasketBallTeamMembers() {
        String expected = "Dallas Mavericks Roster:\n" +
            "BasketballPlayer[name=Luka Doncic, position=Point Guard, ppg=28.7]\n" +
            "BasketballPlayer[name=Dirk Nowitzki, position=Power Forward, ppg=20.7]\n";
        String results = basketballTeam.listTeamMembers();
        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testBaseballTeamSetScoreAndRanking() {
        // ranking = (2 * totalLosses) + totalTies + 1 = (2 * 2) + 2 + 1 = 7
        Assertions.assertEquals(7, baseballTeam.ranking());
    }

    @Test
    public void testBasketballTeamSetScoreAndRanking() {
        // ranking = (2 * totalLosses) + totalTies + 1 = (2 * 1) + 1 + 1 = 4
        Assertions.assertEquals(4, basketballTeam.ranking());
    }

    @Test
    public void testToString() {
        String[] expected = {
                "Team Toronto Blue Jays (Ranked 7)",
                "Team Dallas Mavericks (Ranked 4)",
        };
        String[] results = {
                baseballTeam.toString(),
                basketballTeam.toString()
        };
        Assertions.assertArrayEquals(expected, results);
    }
}