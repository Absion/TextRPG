package com.absion.models;

/**
 * @author Absion
 */
public class LivingBeing {

    //ASSIGNS GENDER TO A LIVING BEING
    public enum Gender {
        MALE, FEMALE, NONGENDER
    }

    private Gender selectedGender;

    //ASSIGNS ALIGNMENT TO A LIVING THING
    public enum Alignment {
        LAWFULNEUTRAL, CHAOTICNEUTRAL, NEUTRAL,
        CHAOTICEVIL, LAWFULEVIL, NEUTRALEVIL,
        LAWFULGOOD, CHAOTICGOOD, NEUTRALGOOD
    }

    private Alignment selectedAlignment;

    //ASSIGNS SIZE TO A LIVING THING
    public enum Size {
        SMALL, MEDIUM, LARGE, GIANT
    }

    private Size selectedSize;

    //THE STAT ATTRIBUTES
    private int strength;
    private int wisdom;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int luck;
    private int charisma;
    private int level;
    private int experience;

    private int age;
    private boolean isKillable;

    private int health;
    private int mana;

    private String name;


    /**
     * Gets the gender of the living thing
     *
     * @return
     */
    public Gender getSelectedGender() {
        return selectedGender;
    }

    /**
     * Sets the gender of the being
     *
     * @param selectedGender
     */
    public void setSelectedGender(Gender selectedGender) {
        this.selectedGender = selectedGender;
    }

    /**
     * Gets the alignment of the creature
     *
     * @return
     */
    public Alignment getSelectedAlignment() {
        return selectedAlignment;
    }

    /**
     * Sets the alignment of the creature
     *
     * @param selectedAlignment
     */
    public void setSelectedAlignment(Alignment selectedAlignment) {
        this.selectedAlignment = selectedAlignment;
    }

    /**
     * Gets the Size of the creature
     *
     * @return
     */
    public Size getSelectedSize() {
        return selectedSize;
    }

    /**
     * Sets the size of the creature
     *
     * @param selectedSize
     */

    public void setSelectedSize(Size selectedSize) {
        this.selectedSize = selectedSize;
    }

    /**
     * Gets the strength of the creature
     *
     * @return
     */

    public int getStrength() {
        return strength;
    }

    /**
     * Sets the strength of the creature.
     *
     * @param strength
     */

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Gets wisdom
     *
     * @return
     */

    public int getWisdom() {
        return wisdom;
    }

    /**
     * Sets the wisdom
     *
     * @param wisdom
     */

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Gets dexterity
     *
     * @return
     */

    public int getDexterity() {
        return dexterity;
    }

    /**
     * Sets dexterity
     *
     * @param dexterity
     */

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Gets the constitution of the being
     *
     * @return
     */

    public int getConstitution() {
        return constitution;
    }

    /**
     * sets the constitution
     *
     * @param constitution
     */

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    /**
     * gets the intelligence of the being
     *
     * @return
     */

    public int getIntelligence() {
        return intelligence;
    }

    /**
     * sets the intelligence
     *
     * @param intelligence
     */

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * gets the luck of the creature
     *
     * @return
     */

    public int getLuck() {
        return luck;
    }

    /**
     * sets the luck of the creature
     *
     * @param luck
     */

    public void setLuck(int luck) {
        this.luck = luck;
    }

    /**
     * gets the charisma of the creature
     *
     * @return
     */

    public int getCharisma() {
        return charisma;
    }

    /**
     * sets the charisma of the creature
     *
     * @param charisma
     */

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    /**
     * gets the level of the creature
     *
     * @return
     */

    public int getLevel() {
        return level;
    }

    /**
     * sets the beings level
     *
     * @param level
     */

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * gets the age
     *
     * @return
     */

    public int getAge() {
        return age;
    }

    /**
     * sets the age of the creature
     *
     * @param age
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * returns if the being is killable or not
     *
     * @return
     */

    public boolean isIsKillable() {
        return isKillable;
    }

    /**
     * Sets if the being is killable or not
     *
     * @param isKillable
     */

    public void setIsKillable(boolean isKillable) {
        this.isKillable = isKillable;
    }

    /**
     * gets the health of the creature
     *
     * @return
     */

    public int getHealth() {
        return health;
    }

    /**
     * sets the creatures health
     *
     * @param health
     */

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * gets the mana of the creature
     *
     * @return
     */

    public int getMana() {
        return mana;
    }

    /**
     * sets the mana of the being
     *
     * @param mana
     */

    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * gets the name of the being
     *
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * sets the name of the being
     *
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the experience of the being
     *
     * @return
     */

    public int getExperience() {
        return experience;
    }

    /**
     * sets the experience of the being
     *
     * @param experience
     */

    public void setExperience(int experience) {
        this.experience = experience;
    }


}
