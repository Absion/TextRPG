package com.absion.models;

/**
 * Model for any weapons in the game
 *
 * @author Absion
 */
public class Weapon extends Item {

    private int damage;
    private WeaponClass weaponClassification;
    private int accuracy;
    private int criticalMultiplier;

    /**
     * Enum defining the types of weapons available in the game
     */
    public enum WeaponClass {
        GREATSWORD, SHORTSWORD, LONGSWORD, DAGGER, LONGSTAFF, FIST, WAND, RAPIER, GUNBLADE, SHIELD, HANDGUN, RIFLE
    }

    /**
     * gets the critical multiplier of the weapon
     * @return criticalMultiplier
     */
    public int getCriticalMultiplier() {
        return criticalMultiplier;
    }

    /**
     *sets the critical multiplier of the weapon
     * @param criticalMultiplier int value describing the critical multiplier of the weapon. ow often it crits
     */
    public void setCriticalMultiplier(int criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    /**
     * Returns accuracy of the weapon
     * @return accuracy
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * sets the accuracy of the weapon
     * @param accuracy int value describing the accuracy that this weapon has
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * returns how much damage this weapon does
     *
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Sets the weapon damage modifier
     *
     * @param damage int value representing the damage this weapon applies
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * gets the type of weapon this is
     *
     * @return weaponClassification
     */
    public WeaponClass getWeaponClassification() {
        return weaponClassification;
    }

    /**
     * sets what kind of weapon this is
     *
     * @param weaponClassification enum of the types of weapons in the game i.e: GREATSWORD, SHORTSWORD,
     *                             LONGSWORD, DAGGER, LONGSTAFF, FIST, WAND, RAPIER, GUNBLADE, SHIELD,
     *                             HANDGUN, RIFLE
     */
    public void setWeaponClassification(WeaponClass weaponClassification) {
        this.weaponClassification = weaponClassification;
    }


}
