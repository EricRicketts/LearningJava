package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints, strength;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        return new ArrayList<String>(
                Arrays.asList(getName(), String.valueOf(getHitPoints()), String.valueOf(getStrength()))
        );
    }

    @Override
    public void read(List<String> monsterAttributes) {
        if (monsterAttributes == null)
            return;
        if (monsterAttributes.size() <= 0)
            return;
        name = monsterAttributes.get(0);
        hitPoints = Integer.parseInt(monsterAttributes.get(1));
        strength = Integer.parseInt(monsterAttributes.get(2));
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
}
