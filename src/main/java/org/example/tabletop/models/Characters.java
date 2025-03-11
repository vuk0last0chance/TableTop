package org.example.tabletop.models;

public class Characters {

    String name;
    double level;
    double experience;

    boolean isPlayerControlled;
    boolean isAlive;

    double totalHealth;
    double totalStamina;
    double totalMana;

    double currentHealth;
    double currentStamina;
    double currentMana;

    double intelligence;
    double strength;
    double dexterity;
    double charisma;
    double endurance;
    double wisdom;
    double luck;

    // Base stats, before equipment modifiers
    double basePhysicalAtk;
    double basePhysicalDef;
    double baseMagicalAtk;
    double baseMagicalDef;
    double baseSpeed;
    double baseTotalHealth;
    double baseTotalStamina;
    double baseTotalMana;
    double baseIntelligence;
    double baseStrength;
    double baseDexterity;
    double baseCharisma;
    double baseEndurance;
    double baseWisdom;
    double baseLuck;


    double physicalAtk;
    double physicalDef;
    double magicalAtk;
    double magicalDef;
    double speed;

    double healthRegenRate;
    double staminaRegenRate;
    double manaRegenRate;

    private Inventory inventory; // Reference to Inventory class


    public Characters(String name, double level, double experience, double totalHealth, double totalStamina, double totalMana, double intelligence, double strength, double dexterity, double charisma, double endurance, double wisdom, double luck, double physicalAtk, double physicalDef, double magicalAtk, double magicalDef, double speed, boolean isAlive, boolean isPlayerControlled, double healthRegenRate, double staminaRegenRate, double manaRegenRate) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.totalHealth = totalHealth;
        this.totalStamina = totalStamina;
        this.totalMana = totalMana;
        this.currentHealth = totalHealth;
        this.currentStamina = totalStamina;
        this.currentMana = totalMana;
        this.intelligence = intelligence;
        this.strength = strength;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.endurance = endurance;
        this.wisdom = wisdom;
        this.luck = luck;

        //Initialize base stats to constructor values
        this.basePhysicalAtk = physicalAtk;
        this.basePhysicalDef = physicalDef;
        this.baseMagicalAtk = magicalAtk;
        this.baseMagicalDef = magicalDef;
        this.baseSpeed = speed;
        this.baseTotalHealth = totalHealth;
        this.baseTotalStamina = totalStamina;
        this.baseTotalMana = totalMana;
        this.baseIntelligence = intelligence;
        this.baseStrength = strength;
        this.baseDexterity = dexterity;
        this.baseCharisma = charisma;
        this.baseEndurance = endurance;
        this.baseWisdom = wisdom;
        this.baseLuck = luck;


        this.physicalAtk = physicalAtk;
        this.physicalDef = physicalDef;
        this.magicalAtk = magicalAtk;
        this.magicalDef = magicalDef;
        this.speed = speed;
        this.isAlive = isAlive;
        this.isPlayerControlled = isPlayerControlled;
        this.healthRegenRate = healthRegenRate;
        this.staminaRegenRate = staminaRegenRate;
        this.manaRegenRate = manaRegenRate;
        this.inventory = new Inventory();
    }

    public void increaseCurrentHealth(double amount) {
        this.currentHealth += amount;
        if (this.currentHealth > this.totalHealth) {
            this.currentHealth = this.totalHealth;
        }
        if (this.currentHealth <= 0) {
            this.currentHealth = 0;
            this.isAlive = false;
        }
    }

    public void decreaseCurrentHealth(double amount) {
        this.currentHealth -= amount;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
            this.isAlive = false;
        }
    }

    public void increaseCurrentStamina(double amount) {
        this.currentStamina += amount;
        if (this.currentStamina > this.totalStamina) {
            this.currentStamina = this.totalStamina;
        }
    }

    public void decreaseCurrentStamina(double amount) {
        this.currentStamina -= amount;
        if (this.currentStamina < 0) {
            this.currentStamina = 0;
        }
    }

    public void increaseCurrentMana(double amount) {
        this.currentMana += amount;
        if (this.currentMana > this.totalMana) {
            this.currentMana = this.totalMana;
        }
    }

    public void decreaseCurrentMana(double amount) {
        this.currentMana -= amount;
        if (this.currentMana < 0) {
            this.currentMana = 0;
        }
    }

    public void increaseExperience(double amount) {
        this.experience += amount;
        // Level up check placeholder
    }


    public void levelUp() {
        this.level++;
        this.experience = 0;
        this.currentHealth = this.totalHealth;
        this.currentStamina = this.totalStamina;
        this.currentMana = this.totalMana;
        // Level up stat increase logic placeholder
    }


    public void regenerate() {
        regenerateHealth();
        regenerateStamina();
        regenerateMana();
    }

    public void regenerateHealth() {
        increaseCurrentHealth(this.healthRegenRate);
    }

    public void regenerateStamina() {
        increaseCurrentStamina(this.staminaRegenRate);
    }

    public void regenerateMana() {
        increaseCurrentMana(this.manaRegenRate);
    }


    public boolean isCharacterAlive() {
        return isAlive;
    }


    // --- Getters and Setters for Stats ---

    public double getHealthRegenRate() {
        return healthRegenRate;
    }

    public void setHealthRegenRate(double healthRegenRate) {
        this.healthRegenRate = healthRegenRate;
    }

    public double getStaminaRegenRate() {
        return staminaRegenRate;
    }

    public void setStaminaRegenRate(double staminaRegenRate) {
        this.staminaRegenRate = staminaRegenRate;
    }

    public double getManaRegenRate() {
        return manaRegenRate;
    }

    public void setManaRegenRate(double manaRegenRate) {
        this.manaRegenRate = manaRegenRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMagicalDef() {
        return magicalDef;
    }

    public void setMagicalDef(double magicalDef) {
        this.magicalDef = magicalDef;
    }

    public double getMagicalAtk() {
        return magicalAtk;
    }

    public void setMagicalAtk(double magicalAtk) {
        this.magicalAtk = magicalAtk;
    }

    public double getPhysicalDef() {
        return physicalDef;
    }

    public void setPhysicalDef(double physicalDef) {
        this.physicalDef = physicalDef;
    }

    public double getPhysicalAtk() {
        return physicalAtk;
    }

    public void setPhysicalAtk(double physicalAtk) {
        this.physicalAtk = physicalAtk;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public double getWisdom() {
        return wisdom;
    }

    public void setWisdom(double wisdom) {
        this.wisdom = wisdom;
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(double endurance) {
        this.endurance = endurance;
    }

    public double getCharisma() {
        return charisma;
    }

    public void setCharisma(double charisma) {
        this.charisma = charisma;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public double getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(double currentMana) {
        this.currentMana = currentMana;
    }

    public double getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(double currentStamina) {
        this.currentStamina = currentStamina;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public double getTotalMana() {
        return totalMana;
    }

    public void setTotalMana(double totalMana) {
        this.totalMana = totalMana;
    }

    public double getTotalStamina() {
        return totalStamina;
    }

    public void setTotalStamina(double totalStamina) {
        this.totalStamina = totalStamina;
    }

    public double getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(double totalHealth) {
        this.totalHealth = totalHealth;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public boolean isPlayerControlled() {
        return isPlayerControlled;
    }

    public void setPlayerControlled(boolean playerControlled) {
        isPlayerControlled = playerControlled;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    // --- Inventory Access ---
    public Inventory getInventory() {
        return inventory;
    }


    // --- Stat Modifier Methods --- (Used by Inventory class)

    public void increasePhysicalAtk(double amount) { this.physicalAtk += amount; }
    public void increasePhysicalDef(double amount) { this.physicalDef += amount; }
    public void increaseMagicalAtk(double amount) { this.magicalAtk += amount; }
    public void increaseMagicalDef(double amount) { this.magicalDef += amount; }
    public void increaseSpeed(double amount) { this.speed += amount; }
    public void increaseTotalHealth(double amount) { this.totalHealth += amount; }
    public void increaseTotalStamina(double amount) { this.totalStamina += amount; }
    public void increaseTotalMana(double amount) { this.totalMana += amount; }
    public void increaseIntelligence(double amount) { this.intelligence += amount; }
    public void increaseStrength(double amount) { this.strength += amount; }
    public void increaseDexterity(double amount) { this.dexterity += amount; }
    public void increaseCharisma(double amount) { this.charisma += amount; }
    public void increaseEndurance(double amount) { this.endurance += amount; }
    public void increaseWisdom(double amount) { this.wisdom += amount; }
    public void increaseLuck(double amount) { this.luck += amount; }


    // --- Reset Stats to Base --- (For equipment calculations)
    public void resetStatsToBase() {
        this.physicalAtk = basePhysicalAtk;
        this.physicalDef = basePhysicalDef;
        this.magicalAtk = baseMagicalAtk;
        this.magicalDef = baseMagicalDef;
        this.speed = baseSpeed;
        this.totalHealth = baseTotalHealth;
        this.totalStamina = baseTotalStamina;
        this.totalMana = baseTotalMana;
        this.intelligence = baseIntelligence;
        this.strength = baseStrength;
        this.dexterity = baseDexterity;
        this.charisma = baseCharisma;
        this.endurance = baseEndurance;
        this.wisdom = baseWisdom;
        this.luck = baseLuck;
    }

    // --- Sync Current Vitals to Total --- (After equipment changes)
    public void syncCurrentVitalsToTotal() {
        if (this.currentHealth > this.totalHealth) this.currentHealth = this.totalHealth;
        if (this.currentStamina > this.totalStamina) this.currentStamina = this.totalStamina;
        if (this.currentMana > this.totalMana) this.currentMana = this.totalMana;
    }


    // --- Combat Methods (Attack, Take Damage, Use Skill, Calculate Damage) ---

    public void attack(Characters target) {
        if (!isAlive) {
            System.out.println(name + " is defeated and cannot attack!");
            return;
        }
        if (!target.isAlive()) {
            System.out.println(target.getName() + " is already defeated!");
            return;
        }

        double damage = calculateDamage();
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }

    public void takeDamage(double damage) {
        if (!isAlive) return;

        double damageReduction = physicalDef / 100.0;
        double actualDamage = damage * (1.0 - damageReduction);

        decreaseCurrentHealth(actualDamage);
        System.out.println(name + " takes " + actualDamage + " damage.");
        if (!isAlive) {
            System.out.println(name + " has been defeated!");
        }
    }

    public void useSkill(String skillName, Characters target) {
        if (!isAlive) {
            System.out.println(name + " is defeated and cannot use skills!");
            return;
        }
        if (!target.isAlive() && target != this) {
            System.out.println(target.getName() + " is already defeated!");
            return;
        }
        System.out.println(name + " uses skill: " + skillName + " on " + target.getName());
        // Skill logic placeholder
    }

    public double calculateDamage() {
        double damage = physicalAtk; // Base damage
        // Damage calculation now only considers character's own physicalAtk/magicalAtk,
        // Inventory class handles equipment buffs to these stats.
        return damage;
    }
}