package com.absion.models;

/**
 * Model base for every living thing in the game
 * @author Absion
 */
public class LivingBeing {

    /**
     * Enum defining the gender possibilities in the game
     */
    public enum Gender {
        MALE, FEMALE, NONGENDER
    }

    /**
     * Enum defining the alignments in the game. Describes their morality/outlook
     */
    public enum Alignment {
        LAWFULNEUTRAL, CHAOTICNEUTRAL, NEUTRAL,
        CHAOTICEVIL, LAWFULEVIL, NEUTRALEVIL,
        LAWFULGOOD, CHAOTICGOOD, NEUTRALGOOD
    }

    /**
     * Enum defining the sizes creatures in the game can be
     */
    public enum Size {
        SMALL, MEDIUM, LARGE, GIANT
    }

    //THE STAT ATTRIBUTES
    private int strength;
    private int wisdom;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int luck;
    private int charm;

    private int level;
    private int experience;
    private int age;
    private boolean isKillable;
    private int health;
    private int mana;
    private Size selectedSize;
    private Alignment selectedAlignment;
    private Gender selectedGender;
    private String name;


    /**
     * Gets the gender of the living thing
     *
     * @return selectedGender
     */
    public Gender getSelectedGender() {
        return selectedGender;
    }

    /**
     * Sets the gender of the being
     *
     * @param selectedGender Enum of the possible genders in game i.e: MALE, FEMALE, NONGENDER
     */
    public void setSelectedGender(Gender selectedGender) {
        this.selectedGender = selectedGender;
    }

    /**
     * Gets the alignment of the creature
     *
     * @return selectedAlignment
     */
    public Alignment getSelectedAlignment() {
        return selectedAlignment;
    }

    /**
     * Sets the alignment of the creature
     *
     * @param selectedAlignment Enum of the possible alignments in the game i.e: LAWFULNEUTRAL,
     *                          CHAOTICNEUTRAL, NEUTRAL,
     *                          CHAOTICEVIL, LAWFULEVIL, NEUTRALEVIL,
     *                          LAWFULGOOD, CHAOTICGOOD, NEUTRALGOOD
     */
    public void setSelectedAlignment(Alignment selectedAlignment) {
        this.selectedAlignment = selectedAlignment;
    }

    /**
     * Gets the Size of the creature
     *
     * @return selectedSize
     */
    public Size getSelectedSize() {
        return selectedSize;
    }

    /**
     * Sets the size of the creature
     *
     * @param selectedSize Enum of the possible sizes in the game i.e: SMALL, MEDIUM, LARGE, GIANT
     */

    public void setSelectedSize(Size selectedSize) {
        this.selectedSize = selectedSize;
    }

    /**
     * Gets the strength of the creature
     *
     * @return strength
     */

    public int getStrength() {
        return strength;
    }

    /**
     * Sets the strength of the creature.
     *
     * @param strength int value describing how strong the creature is
     */

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Gets wisdom
     *
     * @return wisdom
     */

    public int getWisdom() {
        return wisdom;
    }

    /**
     * Sets the wisdom
     *
     * @param wisdom int describing how wise or experienced the creature is
     */

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Gets dexterity
     *
     * @return dexterity
     */

    public int getDexterity() {
        return dexterity;
    }

    /**
     * Sets dexterity
     *
     * @param dexterity int describing how agile/flexible/skilled the creature is
     */

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Gets the constitution of the being
     *
     * @return constitution
     */

    public int getConstitution() {
        return constitution;
    }

    /**
     * sets the constitution
     *
     * @param constitution int describing how healthy and robust the creature's body is
     */

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    /**
     * gets the intellect of the being
     *
     * @return intellect
     */

    public int getIntellect() {
        return intellect;
    }

    /**
     * sets the intellect
     *
     * @param intellect int value describing the amount of facts or knowledge the creature has memorized
     */

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    /**
     * gets the luck of the creature
     *
     * @return luck
     */

    public int getLuck() {
        return luck;
    }

    /**
     * sets the luck of the creature
     *
     * @param luck int value describing how much fate favors this creature
     */

    public void setLuck(int luck) {
        this.luck = luck;
    }

    /**
     * gets the charm of the creature
     *
     * @return charm
     */

    public int getCharm() {
        return charm;
    }

    /**
     * sets the charm of the creature
     *
     * @param charm int value describing how attractive/charming/cute the creature is
     */

    public void setCharm(int charm) {
        this.charm = charm;
    }

    /**
     * gets the level of the creature
     *
     * @return level
     */

    public int getLevel() {
        return level;
    }

    /**
     * sets the beings level
     *
     * @param level int value describing how much over all experience and ability the creature has
     */

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * gets the age
     *
     * @return age
     */

    public int getAge() {
        return age;
    }

    /**
     * sets the age of the creature
     *
     * @param age int value describing how old the creature is
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * returns if the being is killable or not
     *
     * @return isKillable
     */

    public boolean isIsKillable() {
        return isKillable;
    }

    /**
     * Sets if the being is killable or not
     *
     * @param isKillable boolean describing if the creature can be killed or not
     */

    public void setIsKillable(boolean isKillable) {
        this.isKillable = isKillable;
    }

    /**
     * gets the health of the creature
     *
     * @return health
     */

    public int getHealth() {
        return health;
    }

    /**
     * sets the creatures health
     *
     * @param health int value describing the overall health of the creature
     */

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * gets the mana of the creature
     *
     * @return mana
     */

    public int getMana() {
        return mana;
    }

    /**
     * sets the mana of the being
     *
     * @param mana int value describing how much magic the being can contain
     */

    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * gets the name of the being
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * sets the name of the being
     *
     * @param name string holding the name of the creature
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the experience of the being
     *
     * @return experience
     */

    public int getExperience() {
        return experience;
    }

    /**
     * sets the experience of the being
     *
     * @param experience int representation of the total experience the being has
     */

    public void setExperience(int experience) {
        this.experience = experience;
    }


}
