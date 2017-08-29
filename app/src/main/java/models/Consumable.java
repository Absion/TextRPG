package models;

/**
 *
 * @author Absion
 */
public class Consumable extends KeyItem {
    
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
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of a consumable
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the selected type of a consumable
     * @return
     */
    public ConsumableType getSelectedType() {
        return selectedType;
    }

    /**
     * sets the selected type of a consumable
     * @param selectedType
     */
    public void setSelectedType(ConsumableType selectedType) {
        this.selectedType = selectedType;
    }

   
    
    
    
}
