package org.example;

public class Player {

    private String name;
    private int health;
    private String weapon;

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

    public String introducePlayerNameAndWeapon() {
        return this.getName() + " has a " + this.getWeapon() + ".";
    }

    public String loseHealth(int damage) {
        this.health -= damage;
        return this.health < 0 ? "Player knocked out of game." : "Player still in game.";
    }

    public String restoreHealth(int extraHealth) {
       this.health += extraHealth;
       if (this.health > 100) {
           this.health = 100;
           return "Player health is restored to 100%.";
       } else {
           return "Player health is " + this.health + ".";
       }
    }

    public int remainingHealth() { return this.health; }

    public Player(String name) {
        this(name, 100, "Sword");
    }

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health <= 0 ? 1 : Math.min(health, 100);
        this.weapon = weapon;
    }
}
