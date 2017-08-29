package models;

/**
 *
 * @author Absion
 */
public class Armor extends KeyItem {

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
     * @return
     */
    public ArmorClass getArmorClassification() {
        return armorClassification;
    }

    /**
     * Armor classification setter
     * @param armorClassification
     */
    public void setArmorClassification(ArmorClass armorClassification) {
        this.armorClassification = armorClassification;
    }

    /**
     * Getter for the body part that the item will handle
     * @return
     */
    public BodyPart getBodyClassification() {
        return bodyClassification;
    }

    /**
     * Sets the body part for the armor piece
     * @param bodyClassification
     */
    public void setBodyClassification(BodyPart bodyClassification) {
        this.bodyClassification = bodyClassification;
    }

    /**
     * Gets the defense given by the armor
     * @return
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense of the armor
     * @param defense
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    
    
}
