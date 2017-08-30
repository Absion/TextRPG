package com.absion.models;

/**
 *Base model for NPC creatures
 * @author Absion
 */
public class NonPlayerCharacter extends Humanoid {
    
    private boolean isShopKeeper;
    private boolean isQuestGiver;
    private boolean isEnemy;

    /**
     * returns if the NPC is a shopkeeper or not
     * @return isShopKeeper
     */
    public boolean isIsShopKeeper() {
        return isShopKeeper;
    }

    /**
     *sets if this npc is a shopkeeper or not
     * @param isShopKeeper boolean value true = shopkeeper
     */
    public void setIsShopKeeper(boolean isShopKeeper) {
        this.isShopKeeper = isShopKeeper;
    }

    /**
     * asks if this npc is a quest giver or not
     * @return isQuestGiver
     */
    public boolean isIsQuestGiver() {
        return isQuestGiver;
    }

    /**
     *sets if the npc is a questgiver or not
     * @param isQuestGiver bollean value true = quest giver
     */
    public void setIsQuestGiver(boolean isQuestGiver) {
        this.isQuestGiver = isQuestGiver;
    }

    /**
     * returns if this npc is an enemy to the player or not
     * @return isEnemy
     */
    public boolean isIsEnemy() {
        return isEnemy;
    }

    /**
     *sets if the npc is an enemy to the player or not
     * @param isEnemy boolean value true = enemy
     */
    public void setIsEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }
    
    
    
}
