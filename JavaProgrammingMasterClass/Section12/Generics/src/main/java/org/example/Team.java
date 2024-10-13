package org.example;

import java.util.ArrayList;
import java.util.List;

/*
    A comment is due here, the "T" in this generic class can be any class, in this case with the statement
    "Team<T extends Player>" we are requiring that T be the Player class or any subclass of Player.  If we had only
    "Team<T>" then T could be any class such as String or Integer.  Note we cannot use primitives with Generics, so
    "Team<int>" is not allowed, however, the primitive wrappers are allowed, i.e., "Team<Integer>" so essentially, the
    use of primitives is covered by this use of the primitive wrapper classes.

    Note just to make sure all confusion is alleviated, "Team<T extends Player>" does not have the same effect as
    when we use it in declaring subclasses, i.e., "public class MountainBike extends Bicycle".  As mentioned above
    using "extends" within the "<>" in this case means the parameterized type T must be the Player class or a subtype
    of the Player class.

    Player could have been either a Class or an Interface, the syntax would be the same.  Player serves as the "upper
    bound" for the type which is allowed to be used with this class.

    Review Reasons for specifying an Upper Bound:

    1.  An upper bound permits access to the bounded type's functionality.
    2.  An upper bound limits the kind of type parameters you can use when using a Generic Class.  This type must be
    equal to or a subtype of the bounded type.
*/
public class Team<T extends Player, S> {

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation = (S) "";

    public String getTeamName() {
        return teamName;
    }

    public List<T> getTeamMembers() {
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

    public S getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(S affiliation) {
        this.affiliation = affiliation;
    }

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
        String s = affiliation == null ? "" : " AFFILIATION: " + affiliation;
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
        return this.getClass().getSimpleName() + " " + teamName + " (Ranked " + ranking() + ")";
    }

    public Team(String teamName, Affiliation philly) {
        this.teamName = teamName;
    }
}
