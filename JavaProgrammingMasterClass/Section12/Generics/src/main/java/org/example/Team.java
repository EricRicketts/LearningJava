package org.example;

import java.util.ArrayList;
import java.util.List;

/*
    A comment is due here, the "T" in this generic class can be any class, most likely it will be of some
    player type upon implementation.  This is important because for a given team we only want one player type.
    For instance, we do not want to put basketball players on a baseball team.  Given the player type upon
    implementation, Java will run type checking to ensure that only that player type is included on the team
    roster.
*/
public class Team<T> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public String listTeamMembers() {
        // Since the team is generic, we do not know what kind of players will be added to the team
        // until runtime.  Since each player will be an object of some kind, but we do not know the fields
        // of any player until runtime, we just use to the toString() method as this will work on any
        // object in Java.
        String teamMembersList = teamName + " Roster:\n";
        for (T player : teamMembers) {
            teamMembersList +=  player.toString() + "\n";
        };
        return teamMembersList;
    }

    public int ranking() {
        // emphasize losses over times, best ranking is 1
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins += 1;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies += 1;
            message = "tied";
        } else { totalLosses += 1; }
        return message;
    }

    @Override
    public String toString() {
        return "BaseballTeam " + teamName + " ( Ranked " + ranking() + ")";
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }
}
