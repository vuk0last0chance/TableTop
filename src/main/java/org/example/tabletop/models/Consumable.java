package org.example.tabletop.models;

import org.example.tabletop.enums.ItemType;

public class Consumable extends Item{
    private String effect;
    private double effectVariable;
    private double maxStack;

    public Consumable(String rarity, String name, String description, ItemType type, Double value, String effect, double effectVariable, double maxStack) {
        super(rarity, name, description, type, value);
        this.effect = effect;
        this.effectVariable = effectVariable;
        this.maxStack = maxStack;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public double getEffectVariable() {
        return effectVariable;
    }

    public void setEffectVariable(double effectVariable) {
        this.effectVariable = effectVariable;
    }

    public double getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(double maxStack) {
        this.maxStack = maxStack;
    }
}
