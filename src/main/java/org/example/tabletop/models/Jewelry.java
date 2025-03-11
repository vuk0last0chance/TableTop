package org.example.tabletop.models;

import org.example.tabletop.enums.ItemType;

public class Jewelry extends Item{

    double IntBuff;
    double StrBuff;
    double EndBuff;
    double ChaBuff;
    double LuckBuff;
    double WisBuff;
    double DexBuff;
    double StaminaBuff;
    double HealthBuff;
    double ManaBuff;

    public Jewelry(String rarity, String name, String description, ItemType type, Double value, double intBuff, double strBuff, double endBuff, double chaBuff, double luckBuff, double wisBuff, double dexBuff, double staminaBuff, double healthBuff, double manaBuff) {
        super(rarity, name, description, type, value);
        IntBuff = intBuff;
        StrBuff = strBuff;
        EndBuff = endBuff;
        ChaBuff = chaBuff;
        LuckBuff = luckBuff;
        WisBuff = wisBuff;
        DexBuff = dexBuff;
        StaminaBuff = staminaBuff;
        HealthBuff = healthBuff;
        ManaBuff = manaBuff;
    }

    public double getIntBuff() {
        return IntBuff;
    }

    public void setIntBuff(double intBuff) {
        IntBuff = intBuff;
    }

    public double getStrBuff() {
        return StrBuff;
    }

    public void setStrBuff(double strBuff) {
        StrBuff = strBuff;
    }

    public double getEndBuff() {
        return EndBuff;
    }

    public void setEndBuff(double endBuff) {
        EndBuff = endBuff;
    }

    public double getChaBuff() {
        return ChaBuff;
    }

    public void setChaBuff(double chaBuff) {
        ChaBuff = chaBuff;
    }

    public double getLuckBuff() {
        return LuckBuff;
    }

    public void setLuckBuff(double luckBuff) {
        LuckBuff = luckBuff;
    }

    public double getWisBuff() {
        return WisBuff;
    }

    public void setWisBuff(double wisBuff) {
        WisBuff = wisBuff;
    }

    public double getDexBuff() {
        return DexBuff;
    }

    public void setDexBuff(double dexBuff) {
        DexBuff = dexBuff;
    }

    public double getStaminaBuff() {
        return StaminaBuff;
    }

    public void setStaminaBuff(double staminaBuff) {
        StaminaBuff = staminaBuff;
    }

    public double getHealthBuff() {
        return HealthBuff;
    }

    public void setHealthBuff(double healthBuff) {
        HealthBuff = healthBuff;
    }

    public double getManaBuff() {
        return ManaBuff;
    }

    public void setManaBuff(double manaBuff) {
        ManaBuff = manaBuff;
    }
}
