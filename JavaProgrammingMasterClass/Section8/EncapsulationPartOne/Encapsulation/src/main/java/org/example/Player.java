package org.example;

public class Player {

    public String name;
    public int health;
    public String Weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;
    }

    public int remainingHealth() {
        return this.health;
    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        Weapon = weapon;
    }
}
