/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexample;

/**
 *
 * @author mads_
 */
public class Game {
    
    private static Game instance;
    private int points;
    
    
    //The following method is called the singleton pattern
    public static Game createInstance()
    {
        if(instance == null)
            instance = new Game();
        
        return instance;
    }
    
    private Game()
    {
        
    }
    
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
}
