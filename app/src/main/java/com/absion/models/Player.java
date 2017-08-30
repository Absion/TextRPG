package com.absion.models;

/**
 *Model for the player object in the game
 * @author Absion
 */
public class Player extends Humanoid {
    
    private int money;

    /**
     * returns how much money currently held
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * sets how much money the player has
     * @param money int to hold how much money held
     */
    public void setMoney(int money) {
        this.money = money;
    }
    
    
    
}
