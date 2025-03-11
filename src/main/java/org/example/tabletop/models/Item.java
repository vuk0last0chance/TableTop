package org.example.tabletop.models;

import org.example.tabletop.enums.ItemType;

public class Item {
    String name;
    String description;
    private ItemType type;
    Double value;
    String rarity;

    public Item(String rarity,String name, String description, ItemType type, Double value) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
