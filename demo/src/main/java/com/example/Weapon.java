package com.example;

public class Weapon {
    private String name;
    private int damage;
    private int accuracy;
    private int range;
    private int levelRequired;
    private int maxUses;
    private int cooldownRounds;
    private int currentUses;
    private int remainingCooldown;

    // Constructor
    public Weapon(String name, int damage, int accuracy, int range, int levelRequired, int maxUses, int cooldownRounds) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.range = range;
        this.levelRequired = levelRequired;
        this.maxUses = maxUses;
        this.cooldownRounds = cooldownRounds;
        this.currentUses = maxUses;
        this.remainingCooldown = 0;
    }

    // Method to use the weapon
    public boolean useWeapon() {
        if (remainingCooldown > 0) {
            System.out.println(name + " is recharging. Remaining rounds: " + remainingCooldown);
            return false;
        }
        
        if (currentUses > 0) {
            currentUses--;
            System.out.println(name + " used! Remaining uses: " + currentUses);
            if (currentUses == 0) {
                remainingCooldown = cooldownRounds;
                System.out.println(name + " needs to recharge for " + cooldownRounds + " rounds.");
            }
            return true;
        } else {
            System.out.println(name + " is out of uses and needs to recharge.");
            return false;
        }
    }

    // Method to progress one round
    public void nextRound() {
        if (remainingCooldown > 0) {
            remainingCooldown--;
            if (remainingCooldown == 0) {
                currentUses = maxUses;
                System.out.println(name + " is fully recharged and ready to use.");
            }
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        this.levelRequired = levelRequired;
    }

    public int getMaxUses() {
        return maxUses;
    }

    public void setMaxUses(int maxUses) {
        this.maxUses = maxUses;
    }

    public int getCooldownRounds() {
        return cooldownRounds;
    }

    public void setCooldownRounds(int cooldownRounds) {
        this.cooldownRounds = cooldownRounds;
    }

    public int getCurrentUses() {
        return currentUses;
    }

    public void setCurrentUses(int currentUses) {
        this.currentUses = currentUses;
    }

    public int getRemainingCooldown() {
        return remainingCooldown;
    }

    public void setRemainingCooldown(int remainingCooldown) {
        this.remainingCooldown = remainingCooldown;
    }
}
