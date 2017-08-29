package com.absion.models;

/**
 * Model that will be the basis for every consumable item in the game
 *
 * @author Absion
 */
public class Consumable extends Item {


    public enum ConsumableType {
        HEALTH, MANA, STRENGTH, WISDOM,
        INTELLIGENCE, DEXTERITY, CONSTITUTION,
        CHARISMA, LUCK, HEALTHPOISON, MANAPOISON,
        STRENGTHPOISON, WISDOMPOISON,
        INTELLIGENCEPOISON, DEXTERITYPOISON,
        CONSTITUTIONPOISON, CHARISMAPOISON, LUCKPOISON,
    }

    private ConsumableType selectedType;

    private int quantity;

    /**
     * Gets the quantity of a consumable
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of a consumable
     *
     * @param quantity How many there are
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the selected type of a consumable
     *
     * @return selectedType
     */
    public ConsumableType getSelectedType() {
        return selectedType;
    }

    /**
     * sets the selected type of a consumable
     *
     * @see ConsumableType
     * @param selectedType What type of comsumable item it is i.e:  HEALTH, MANA, STRENGTH, WISDOM,
     *                     INTELLIGENCE, DEXTERITY, CONSTITUTION,
     *                     CHARISMA, LUCK, HEALTHPOISON, MANAPOISON,
     *                     STRENGTHPOISON, WISDOMPOISON,
     *                     INTELLIGENCEPOISON, DEXTERITYPOISON,
     *                     CONSTITUTIONPOISON, CHARISMAPOISON, LUCKPOISON,
     */
    public void setSelectedType(ConsumableType selectedType) {
        this.selectedType = selectedType;
    }


}
