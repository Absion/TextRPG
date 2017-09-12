package com.absion.android;

import com.absion.models.LivingBeing;
import com.absion.models.Monster;

import java.util.Random;

/**
 * This is the class file that will generate enemies in the game
 *
 * @author Absion
 */
public final class EnemyGenerator {


    /**
     * A random generator for a canine monster
     *
     * @param areaLevel The level of the area that this monster was found in
     * @param areaType  The type of the area the monster was found in
     * @return
     */
    public static Monster createCanineMonster(int areaLevel, String areaType) {

        //Random used to create monsters
        Random random = new Random();

        Monster dog = new Monster();


        //These traits are shared amongst all canines
        dog.setIsKillable(true);
        dog.setSelectedAlignment(LivingBeing.Alignment.CHAOTICNEUTRAL);
        dog.setSelectedSize(LivingBeing.Size.MEDIUM);
        dog.setSelectedType(Monster.MonsterType.BEAST);

        //Sets Canine's level from minimum of 1 to +3 the level of the area
        dog.setExperience(0);
        dog.setLevel();

        //Sets Canine's age from minimum of 1 to +5 the level of the area
        dog.setAge(setAgeBasicCreature(areaLevel));

        //Randomly chooses if the canine is female or male.
        int genderChooser = random.nextInt(3) + 1;
        if (genderChooser % 2 == 0) {
            dog.setSelectedGender(LivingBeing.Gender.FEMALE);
        } else {
            dog.setSelectedGender(LivingBeing.Gender.MALE);
        }

        //Chooses rank based on level
        dog.setSelectedRank(setRank(dog.getLevel()));

        //Sets name based on rank and location
        String switchController = dog.getSelectedRank().toString();
        switch (switchController) {
            case "COMMON":
                dog.setName("Stray " + areaType + " Dog");
                break;
            case "ALPHA":
                dog.setName("Prowling " + areaType + " Wolf");
                break;
            case "EPIC":
                dog.setName("Dignified " + areaType + " Packleader");
                break;
            case "LEGENDARY":
                dog.setName("Battle-Scarred " + areaType + " DireWolf");
                break;
        }

        //Sets Charisma
        switch (switchController) {
            case "COMMON":
                dog.setCharm(random.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setCharm(random.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setCharm(random.nextInt(5) + 1);
                break;
            case "LEGENDARY":
                dog.setCharm(random.nextInt(6) + 1);
                break;
        }

        //Sets Constitution
        switch (switchController) {
            case "COMMON":
                dog.setConstitution(random.nextInt(3) + 1);
                break;
            case "ALPHA":
                dog.setConstitution(random.nextInt(4) + 1);
                break;
            case "EPIC":
                dog.setConstitution(random.nextInt(7) + 1);
                break;
            case "LEGENDARY":
                dog.setConstitution(random.nextInt(9) + 1);
                break;
        }

        //Sets Dexterity
        switch (switchController) {
            case "COMMON":
                dog.setDexterity(random.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setDexterity(random.nextInt(4) + 1);
                break;
            case "EPIC":
                dog.setDexterity(random.nextInt(8) + 1);
                break;
            case "LEGENDARY":
                dog.setDexterity(random.nextInt(10) + 1);
                break;
        }

        //Sets Intelligence
        switch (switchController) {
            case "COMMON":
                dog.setIntellect(random.nextInt(1) + 1);
                break;
            case "ALPHA":
                dog.setIntellect(random.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setIntellect(random.nextInt(5) + 1);
                break;
            case "LEGENDARY":
                dog.setIntellect(random.nextInt(8) + 1);
                break;
        }

        //Sets Luck
        switch (switchController) {
            case "COMMON":
                dog.setLuck(random.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setLuck(random.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setLuck(random.nextInt(5) + 1);
                break;
            case "LEGENDARY":
                dog.setLuck(random.nextInt(6) + 1);
                break;
        }

        //Sets Strength
        switch (switchController) {
            case "COMMON":
                dog.setStrength(random.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setStrength(random.nextInt(4) + 1);
                break;
            case "EPIC":
                dog.setStrength(random.nextInt(6) + 1);
                break;
            case "LEGENDARY":
                dog.setStrength(random.nextInt(8) + 1);
                break;
        }

        //Sets Wisdom
        switch (switchController) {
            case "COMMON":
                dog.setWisdom(random.nextInt(2) + 1);
                break;
            case "ALPHA":
                dog.setWisdom(random.nextInt(3) + 1);
                break;
            case "EPIC":
                dog.setWisdom(random.nextInt(7) + 1);
                break;
            case "LEGENDARY":
                dog.setWisdom(random.nextInt(9) + 1);
                break;
        }

        //Sets Health Pool
        dog.setHealth(dog.getConstitution() * 80);

        //Sets Mana Pool
        dog.setMana(dog.getWisdom() * 40);


        return dog;
    }

    /**
     * Method for generating the rank of a creature
     *
     * @param level level passed in to the function of the creature
     * @return returnValue
     */
    public static Monster.MonsterRank setRank(int level) {

        Monster.MonsterRank returnValue = null;

        //Chooses rank based on level
        if (level <= 10) {
            returnValue = Monster.MonsterRank.COMMON;
        }
        if (level <= 15 && level > 10) {
            returnValue = Monster.MonsterRank.ALPHA;
        }
        if (level <= 20 && level > 15) {
            returnValue = Monster.MonsterRank.EPIC;
        }
        if (level > 20) {
            returnValue = Monster.MonsterRank.LEGENDARY;
        }

        return returnValue;
    }

    /**
     * Sets the age of a basic living creature Should range between age 1 nd 25
     * @param areaLevel level of the area the creature was found in
     * @return randomized int describing the age
     */
    public static int setAgeBasicCreature(int areaLevel) {

        Random random = new Random();

        //Sets age from minimum of 1 to +5 the level of the area
        return random.nextInt(areaLevel + 5) + 1;
    }

    /**
     * Sets the level of a basic creature randomly encountered
     * @param areaLevel The level of the area that the creature has been found in
     * @return The level of the encountered creature
     */
    public static int setLevelBasicCreature(int areaLevel) {
//TODO
        Random random = new Random();

        //Sets age from minimum of 1 to +5 the level of the area
        return random.nextInt(areaLevel + 3) + 1;
    }

    public static LivingBeing.Gender setBinaryGender(){
        LivingBeing.Gender gender = null;

        return gender;
    }

}
