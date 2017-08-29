package com.absion.models;

/**
 *
 * @author Absion
 */
public class Monster extends LivingBeing {
    
    public enum MonsterRank {
        COMMON, ALPHA, LEGENDARY, EPIC
    }
    private MonsterRank selectedRank;
    
    public enum MonsterType {
        BEAST, AQUATIC, ELEMENTAL, DEMON, HEAVENSENT, FOLIAGE
    }
    private MonsterType selectedType;


    /**
     *Gets the rank of the monster
     * @return
     */
    public MonsterRank getSelectedRank() {
        return selectedRank;
    }

    /**
     *Sets the rank of the monster
     * @param selectedRank
     */
    public void setSelectedRank(MonsterRank selectedRank) {
        this.selectedRank = selectedRank;
    }

    /**
     *Gets the type of monster
     * @return
     */
    public MonsterType getSelectedType() {
        return selectedType;
    }

    /**
     * Sets the type of monster
     * @param selectedType
     */
    public void setSelectedType(MonsterType selectedType) {
        this.selectedType = selectedType;
    }
    
    
}
