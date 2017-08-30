package com.absion.models;

/**
 * The base model for every item in the game
 *
 * @author Absion
 */
public class Item {

    //The qualities of an item

    private String itemName;
    private int itemWeight;
    private int itemHealth;
    private int itemValue;
    private String itemHistory;
    private boolean isItKeyItem;
    private ItemRank selectedRank;
    private ElementType selectedElement;

    /**
     * Enum defining the elemental types in the game
     */
    public enum ElementType {
        FIRE, WIND, WATER, ELECTRIC, EARTH, DARK, LIGHT, BASE
    }

    /**
     * The enum defining the ranks that any item in the game can be
     */
    public enum ItemRank {
        NORMAL, RARE, LEGENDARY, EPIC
    }


    /**
     * Gets the name of an item
     *
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * sets the item name
     *
     * @param itemName The name to be applied to this item
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * get the item weight
     *
     * @return itemWeight
     */
    public int getItemWeight() {
        return itemWeight;
    }

    /**
     * set the item weight
     *
     * @param itemWeight int value describing the weight of the item
     */
    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    /**
     * get the health of an item
     *
     * @return itemHealth
     */
    public int getItemHealth() {
        return itemHealth;
    }

    /**
     * sets the item health
     *
     * @param itemHealth int value describing the health of the item
     */
    public void setItemHealth(int itemHealth) {
        this.itemHealth = itemHealth;
    }

    /**
     * gets the value of an item
     *
     * @return itemValue
     */
    public int getItemValue() {
        return itemValue;
    }

    /**
     * sets the item value
     *
     * @param itemValue int value describing the vaue of the item
     */
    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

    /**
     * Gets the history of the item
     *
     * @return itemHistory
     */
    public String getItemHistory() {
        return itemHistory;
    }

    /**
     * sets the item history
     *
     * @param itemHistory A string describing the history of a item
     */
    public void setItemHistory(String itemHistory) {
        this.itemHistory = itemHistory;
    }

    /**
     * Get the element of the item in question
     *
     * @return selectedElement
     */
    public ElementType getSelectedElement() {
        return selectedElement;
    }

    /**
     * Sets the element of the item
     *
     * @param selectedElement The element type to be applied to the item i.e: FIRE, WIND, WATER,
     *                        ELECTRIC, EARTH, DARK, LIGHT, BASE
     */
    public void setSelectedElement(ElementType selectedElement) {
        this.selectedElement = selectedElement;
    }

    /**
     * Gets the rank of the item
     *
     * @return selectedRank
     */
    public ItemRank getSelectedRank() {
        return selectedRank;
    }

    /**
     * Sets the rank of the item
     *
     * @param selectedRank The ranking applied to the item. i.e: NORMAL, RARE, LEGENDARY, EPIC
     */
    public void setSelectedRank(ItemRank selectedRank) {
        this.selectedRank = selectedRank;
    }

    /**
     * checks if the item is a key item
     *
     * @return isItKeyItem
     */
    public boolean isItKeyItem() {
        return isItKeyItem;
    }

    /**
     * Set if the item is a keyitem or not
     *
     * @param itKeyItem a boolean describing if it is a key item or not. True for yes False for no
     */
    public void setItKeyItem(boolean itKeyItem) {
        isItKeyItem = itKeyItem;
    }


}
