package org.example.tabletop.models;

public class Item {
    String name;
    String description;
    String type;
    Double value;
    String rarity;

    public Item(String rarity,String name, String description, String type, Double value) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
