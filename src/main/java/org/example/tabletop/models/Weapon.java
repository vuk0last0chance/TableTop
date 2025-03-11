package org.example.tabletop.models;

public class Weapon extends Item{

    double physicalDamageBuff;
    double magicalDamageBuff;
    double physicalDefenseBuff;
    double magicalDefenseBuff;

    public Weapon(String rarity, String name, String description, String type, Double value, double physicalDamageBuff, double magicalDamageBuff, double physicalDefenseBuff, double magicalDefenseBuff) {
        super(rarity, name, description, type, value);
        this.physicalDamageBuff = physicalDamageBuff;
        this.magicalDamageBuff = magicalDamageBuff;
        this.physicalDefenseBuff = physicalDefenseBuff;
        this.magicalDefenseBuff = magicalDefenseBuff;
    }

    public double getPhysicalDamageBuff() {
        return physicalDamageBuff;
    }

    public void setPhysicalDamageBuff(double physicalDamageBuff) {
        this.physicalDamageBuff = physicalDamageBuff;
    }

    public double getMagicalDamageBuff() {
        return magicalDamageBuff;
    }

    public void setMagicalDamageBuff(double magicalDamageBuff) {
        this.magicalDamageBuff = magicalDamageBuff;
    }

    public double getPhysicalDefenseBuff() {
        return physicalDefenseBuff;
    }

    public void setPhysicalDefenseBuff(double physicalDefenseBuff) {
        this.physicalDefenseBuff = physicalDefenseBuff;
    }

    public double getMagicalDefenseBuff() {
        return magicalDefenseBuff;
    }

    public void setMagicalDefenseBuff(double magicalDefenseBuff) {
        this.magicalDefenseBuff = magicalDefenseBuff;
    }
}
