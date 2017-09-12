package com.absion.test;

import com.absion.android.EnemyGenerator;
import com.absion.models.Monster;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Absion
 */
public class EnemyGeneratorTest {
    
    public EnemyGeneratorTest() {
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
     * Test of createCanineMonster method, of class EnemyGenerator.
     */
    @Test
    public void testCreateCanineMonster() {
        System.out.println("createCanineMonster");
        int areaLevel = 26;
        String areaType = "TestArea";
        Monster dog = EnemyGenerator.createCanineMonster(areaLevel, areaType);
        System.out.println(dog.getAge() + " " + dog.getCharm() + " " + dog.getName() + " " + dog.getSelectedRank() + " " + dog.getLevel() + " " + dog.getSelectedGender());
        System.out.println(dog.toString());
    }
    
}
