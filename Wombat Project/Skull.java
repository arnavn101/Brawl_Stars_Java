import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skull extends Actor
{
    int lifeSpan = 10;
    /**
     * Act - do whatever the Skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lifeSpan();
    }    
    public void lifeSpan()
    {
        lifeSpan--;
        if(lifeSpan<0)
        {
            getWorld().removeObject(this);
        }
    }
}
