package org.example;

public interface Player {
    String name();
}
/*
    We just introduced an abstract method after we already declared the same fields in BaseballPlayer and
    BasketballPlayer.  Remember, without declaring the method modifiers, the abstract method is implicitly
    public and static.

    Because BaseballPlayer and BasketballPlayer are Records, the fields already come with getters and setters by
    default.
*/
