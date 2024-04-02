package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable {

    private String name, weapon;
    private int hitPoints, strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return new ArrayList<String>(
                Arrays.asList(getName(), String.valueOf(getHitPoints()),
                        String.valueOf(getStrength()), getWeapon())
                );
    }

    @Override
    public void read(List<String> playerAttributes) {
        List<String> storedAttributes = new ArrayList<>();
        if (playerAttributes.size() > 0) storedAttributes = playerAttributes;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }
}
