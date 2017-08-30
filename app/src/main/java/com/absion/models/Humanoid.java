package com.absion.models;

import java.util.LinkedList;

/**
 * Model of specifically humanoid living beings in the game
 *
 * @author Absion
 */
public class Humanoid extends LivingBeing {

    private String history;
    private Class selectedClass;
    private HumanType selectedHumanType;
    private LinkedList<Item> inventory;
    private LinkedList<Item> equipped;

    /**
     * Enum defining the classes that a humanoid can be
     */
    public enum Class {
        WARRIOR, MARKSMAN, CLERIC,
        ROUGE, MAGICIAN, MERCENARY,
        SOLDIER, PUGILIST, MERCHANT,
        CHILD, ELDER
    }

    /**
     * The Enum defining the existing humanoid races in the game
     */
    public enum HumanType {
        HUMAN, BEASTMAN, ELF, FAIRY
    }

    /**
     * Gets the history of the current humanoid
     *
     * @return history
     */
    public String getHistory() {
        return history;
    }

    /**
     * Sets the history of the current humanoid
     *
     * @param history A Long string containing all of the history of this humanoid
     */
    public void setHistory(String history) {
        this.history = history;
    }

    /**
     * Gets the Class of the humanoid
     *
     * @return selectedClass
     */
    public Class getSelectedClass() {
        return selectedClass;
    }

    /**
     * Sets the class of the humanoid
     *
     * @param selectedClass The Class of the humanoid i.e: WARRIOR, MARKSMAN, CLERIC,
     *                      ROUGE, MAGICIAN, MERCENARY,
     *                      SOLDIER, PUGILIST, MERCHANT,
     *                      CHILD, ELDER
     */
    public void setSelectedClass(Class selectedClass) {
        this.selectedClass = selectedClass;
    }

    /**
     * Gets the human type of the humanoid
     *
     * @return selectedHumanType
     */
    public HumanType getSelectedHumanType() {
        return selectedHumanType;
    }

    /**
     * Sets the type of human
     *
     * @param selectedHumanType The type of humanoid this creature is i.e: HUMAN, BEASTMAN, ELF, FAIRY
     */
    public void setSelectedHumanType(HumanType selectedHumanType) {
        this.selectedHumanType = selectedHumanType;
    }

    /**
     * Gets the inventory of the humanoid
     *
     * @return inventory
     */
    public LinkedList<Item> getInventory() {
        return inventory;
    }

    /**
     * Sets the inventory of the human
     *
     * @param inventory A Linked list describing the items carried by the humanoid
     */
    public void setInventory(LinkedList<Item> inventory) {
        this.inventory = inventory;
    }

    /**
     * Gets current equipped items by the humanoid
     *
     * @return equipped
     */
    public LinkedList<Item> getEquipped() {
        return equipped;
    }

    /**
     * Sets the equipped items.
     *
     * @param equipped A linkdlist containing all the of the items equipped by the humanoid
     */
    public void setEquipped(LinkedList<Item> equipped) {
        this.equipped = equipped;
    }


}
