package org.example;

public record FootballPlayer(
        String name,
        String OffenseOrDefense,
        String position) implements Player{}
