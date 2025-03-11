package org.example.tabletop.models;

import org.example.tabletop.enums.ItemType;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an inventory system for a character in a tabletop game.
 * The inventory stores a list of items and manages equipped items.
 * Equipped items include a weapon, jewelry, and various armor pieces (helmet, chestplate, leggings, boots).
 */
public class Inventory {
    // List of all items in the inventory.
    private List<Item> items;

    // Equipment slots for various item types.
    private Item equippedHelmet;
    private Item equippedChestplate;
    private Item equippedLeggings;
    private Item equippedBoots;
    private Item equippedWeapon;

    // Fixed-size array for jewelry slots (2 slots).
    private Item[] equippedJewelry = new Item[2];

    /**
     * Constructs a new Inventory with an empty list of items and all equipment slots set to null.
     */
    public Inventory() {
        this.items = new ArrayList<>();
        this.equippedWeapon = null;
        this.equippedJewelry[0] = null;
        this.equippedJewelry[1] = null;
        this.equippedHelmet = null;
        this.equippedChestplate = null;
        this.equippedLeggings = null;
        this.equippedBoots = null;
    }

    /**
     * Returns the list of items in the inventory.
     *
     * @return the items list.
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Adds an item to the inventory.
     *
     * @param item the item to add.
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * Removes an item from the inventory.
     *
     * @param item the item to remove.
     */
    public void removeItem(Item item) {
        this.items.remove(item);
    }

    /**
     * Returns the currently equipped weapon.
     *
     * @return the equipped weapon, or null if none.
     */
    public Item getEquippedWeapon() {
        return equippedWeapon;
    }

    /**
     * Returns the array of equipped jewelry items.
     *
     * @return an array of equipped jewelry items.
     */
    public Item[] getEquippedJewelry() {
        return equippedJewelry;
    }

    /**
     * Returns the currently equipped helmet.
     *
     * @return the equipped helmet, or null if none.
     */
    public Item getEquippedHelmet() {
        return equippedHelmet;
    }

    /**
     * Returns the currently equipped chestplate.
     *
     * @return the equipped chestplate, or null if none.
     */
    public Item getEquippedChestplate() {
        return equippedChestplate;
    }

    /**
     * Returns the currently equipped leggings.
     *
     * @return the equipped leggings, or null if none.
     */
    public Item getEquippedLeggings() {
        return equippedLeggings;
    }

    /**
     * Returns the currently equipped boots.
     *
     * @return the equipped boots, or null if none.
     */
    public Item getEquippedBoots() {
        return equippedBoots;
    }

    /**
     * Equips an item to the appropriate slot based on its type.
     * Supported item types include "Weapon", "Jewelry", "Helmet", "Chestplate", "Leggings", and "Boots".
     * After equipping the item, the character's stats are recalculated.
     *
     * @param character the character whose equipment is being modified.
     * @param item      the item to equip.
     */
    public void equipItem(Characters character, Item item) {
        if (item == null) return;

        ItemType itemType = item.getType();

        if ("Weapon".equalsIgnoreCase(String.valueOf(itemType))) {
            // Equip as weapon.
            this.equippedWeapon = item;
        } else if ("Jewelry".equalsIgnoreCase(String.valueOf(itemType))) {
            // Equip in the first available jewelry slot.
            if (equippedJewelry[0] == null) {
                equippedJewelry[0] = item;
            } else if (equippedJewelry[1] == null) {
                equippedJewelry[1] = item;
            } else {
                System.out.println("No more jewelry slots available.");
                return; // Exit if no slots are available.
            }
        } else if ("Helmet".equalsIgnoreCase(String.valueOf(itemType))) {
            // Equip as helmet.
            this.equippedHelmet = item;
        } else if ("Chestplate".equalsIgnoreCase(String.valueOf(itemType))) {
            // Equip as chestplate.
            this.equippedChestplate = item;
        } else if ("Leggings".equalsIgnoreCase(String.valueOf(itemType))) {
            // Equip as leggings.
            this.equippedLeggings = item;
        } else if ("Boots".equalsIgnoreCase(String.valueOf(itemType))) {
            // Equip as boots.
            this.equippedBoots = item;
        } else {
            System.out.println("Cannot equip item type: " + itemType);
            return; // Exit if item type is not equipable.
        }
        // Recalculate character stats after equipping.
        calculateAndApplyStatsFromEquipment(character);
    }

    /**
     * Unequips an item from its slot.
     * Supports unequipping weapon, jewelry, helmet, chestplate, leggings, and boots.
     * After unequipping the item, the character's stats are recalculated.
     *
     * @param character the character whose equipment is being modified.
     * @param item      the item to unequip.
     */
    public void unequipItem(Characters character, Item item) {
        if (item == null) return;

        if (item == equippedWeapon) {
            // Unequip weapon.
            equippedWeapon = null;
        } else if (item == equippedHelmet) {
            // Unequip helmet.
            equippedHelmet = null;
        } else if (item == equippedChestplate) {
            // Unequip chestplate.
            equippedChestplate = null;
        } else if (item == equippedLeggings) {
            // Unequip leggings.
            equippedLeggings = null;
        } else if (item == equippedBoots) {
            // Unequip boots.
            equippedBoots = null;
        } else {
            // Check if the item is equipped in any jewelry slot.
            for (int i = 0; i < equippedJewelry.length; i++) {
                if (item == equippedJewelry[i]) {
                    equippedJewelry[i] = null;
                    break;
                }
            }
        }
        // Recalculate character stats after unequipping.
        calculateAndApplyStatsFromEquipment(character);
    }

    /**
     * Recalculates and applies character stats based on currently equipped items.
     * This method resets the character's stats to their base values, then applies
     * buffs from the equipped weapon and jewelry. Additional equipment (such as armor)
     * buffs can be added as needed.
     *
     * @param character the character whose stats will be recalculated.
     */
    private void calculateAndApplyStatsFromEquipment(Characters character) {
        // Reset character stats to base values first.
        character.resetStatsToBase();

        // Apply weapon buffs if a weapon is equipped.
        if (equippedWeapon instanceof Weapon) {
            Weapon weapon = (Weapon) equippedWeapon;
            character.increasePhysicalAtk(weapon.getPhysicalDamageBuff());
            character.increaseMagicalAtk(weapon.getMagicalDamageBuff());
            character.increasePhysicalDef(weapon.getPhysicalDefenseBuff());
            character.increaseMagicalDef(weapon.getMagicalDefenseBuff());
        }

        // Apply jewelry buffs for each equipped jewelry item.
        for (Item jewelryItem : equippedJewelry) {
            if (jewelryItem instanceof Jewelry) {
                Jewelry jewelry = (Jewelry) jewelryItem;
                character.increaseIntelligence(jewelry.getIntBuff());
                character.increaseStrength(jewelry.getStrBuff());
                character.increaseDexterity(jewelry.getDexBuff());
                character.increaseCharisma(jewelry.getChaBuff());
                character.increaseEndurance(jewelry.getEndBuff());
                character.increaseWisdom(jewelry.getWisBuff());
                character.increaseLuck(jewelry.getLuckBuff());
                character.increaseTotalHealth(jewelry.getHealthBuff());
                character.increaseTotalStamina(jewelry.getStaminaBuff());
                character.increaseTotalMana(jewelry.getManaBuff());
            }
        }

        // TODO: If armor items (helmet, chestplate, leggings, boots) provide buffs,
        // apply their effects on character stats here.

        // Synchronize the character's current vitals (health, stamina, mana) with their total values.
        character.syncCurrentVitalsToTotal();
    }
}
