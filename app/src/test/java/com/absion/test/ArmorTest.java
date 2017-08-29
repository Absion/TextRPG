package com.absion.test;

import com.absion.models.Armor;
import com.absion.models.Item;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author Absion
 */
public class ArmorTest {

    private Armor armor1;
    
    public ArmorTest() {
        armor1 = new Armor();
        armor1.setArmorClassification(Armor.ArmorClass.LEATHER);
        armor1.setBodyClassification(Armor.BodyPart.CHEST);
        armor1.setDefense(100);
        armor1.setSelectedRank(Item.ItemRank.LEGENDARY);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getArmorClassification method, of class Armor.
     */
    @Test
    public void testGetArmorClassification() {
        System.out.println("getArmorClassification");
        boolean result;
        
        result = armor1.getArmorClassification().equals(Armor.ArmorClass.LEATHER);
        assertTrue(result);
        
    }


    /**
     * Test of getBodyClassification method, of class Armor.
     */
    @Test
    public void testGetBodyClassification() {
        System.out.println("getBodyClassification");
        boolean result;
        
        result = armor1.getBodyClassification().equals(Armor.BodyPart.CHEST);
        assertTrue(result);
        
    }

    /**
     * Test of getDefense method, of class Armor.
     */
    @Test
    public void testGetDefense() {
        System.out.println("getDefense");
        int valueHolder; 
        boolean result;
        
        valueHolder = Integer.compare(armor1.getDefense(), 100);

        result = valueHolder == 0;
        assertTrue(result);
        
    }


    @Test
    public void testGetSelectedRank() {
        System.out.println("getSelectedRank");
        boolean result;
        
        result = armor1.getSelectedRank().equals(Item.ItemRank.LEGENDARY);
        assertTrue(result);
        
    }

    
}
