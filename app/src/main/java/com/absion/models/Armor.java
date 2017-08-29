package com.absion.models;

/**
 *The model for every piece of armor in the game
 * @author Absion
 */
public class Armor extends Item {

    public enum ArmorClass {
        STEEL, LEATHER, SCALE, PLATE, CLOTH
    }
    private ArmorClass armorClassification;
    
    public enum BodyPart{
        HEAD, NECK, CHEST, HANDS, FINGER, FEET, LEGS, WAIST, WRIST, EAR 
    }
    private BodyPart bodyClassification;
    
    int defense;

    /**
     * Getter for the armor classification
     * @return armorClassification
     */
    public ArmorClass getArmorClassification() {
        return armorClassification;
    }

    /**
     * Armor classification setter
     * @param armorClassification The type of armor i.e.: STEEL, LEATHER, SCALE, PLATE, CLOTH
     */
    public void setArmorClassification(ArmorClass armorClassification) {
        this.armorClassification = armorClassification;
    }

    /**
     * Getter for the body part that the item will handle
     * @return bodyClassification
     */
    public BodyPart getBodyClassification() {
        return bodyClassification;
    }

    /**
     * Sets the body part for the armor piece
     * @param bodyClassification The part of the body that the armor fits on i.e: HEAD, NECK, CHEST,
     *                           HANDS, FINGER, FEET, LEGS, WAIST, WRIST, EAR
     */
    public void setBodyClassification(BodyPart bodyClassification) {
        this.bodyClassification = bodyClassification;
    }

    /**
     * Gets the defense given by the armor
     * @return defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense of the armor
     * @param defense The defense rating of the armor as an integer
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    
    
}
