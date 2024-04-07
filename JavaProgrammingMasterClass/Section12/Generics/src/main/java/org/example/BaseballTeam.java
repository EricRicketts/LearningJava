package org.example;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private String teamName;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public String getTeamName() {
        return teamName;
    }

    public List<BaseballPlayer> getTeamMembers() {
        return teamMembers;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public int getTotalLosses() {
        return totalLosses;
    }

    public int getTotalTies() {
        return totalTies;
    }

    public void addTeamMember(BaseballPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public String listTeamMembers() {
        String teamMembersList = teamName + " Roster:\n";
        for (BaseballPlayer player : teamMembers) {
            teamMembersList += "Name: " + player.name() + " Position: " + player.position() + "\n";
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

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }
}
