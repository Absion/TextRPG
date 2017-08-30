package com.absion.models;

/**
 * Model for every moster in the game
 * @author Absion
 */
public class Monster extends LivingBeing {

    /**
     * Enum defining the rank of creature that a monster can be in the game. A general view of their
     * power
     */
    public enum MonsterRank {
        COMMON, ALPHA, LEGENDARY, EPIC
    }

    /**
     * Enum defining The species of monster that the creature can be
     */
    public enum MonsterType {
        BEAST, AQUATIC, ELEMENTAL, VOIDSPAWN, HEAVENSENT, FOLIAGE
    }

    private MonsterType selectedType;
    private MonsterRank selectedRank;

    /**
     * Gets the rank of the monster
     *
     * @return selectedRank
     */
    public MonsterRank getSelectedRank() {
        return selectedRank;
    }

    /**
     * Sets the rank of the monster
     *
     * @param selectedRank enum of the possible ranks for this monster i.e: COMMON, ALPHA, LEGENDARY, EPIC
     */
    public void setSelectedRank(MonsterRank selectedRank) {
        this.selectedRank = selectedRank;
    }

    /**
     * Gets the type of monster
     *
     * @return selectedType
     */
    public MonsterType getSelectedType() {
        return selectedType;
    }

    /**
     * Sets the type of monster
     *
     * @param selectedType enum of the possible species type i.e: BEAST, AQUATIC, ELEMENTAL,
     *                     VOIDSPAWN, HEAVENSENT, FOLIAGE
     */
    public void setSelectedType(MonsterType selectedType) {
        this.selectedType = selectedType;
    }


}
