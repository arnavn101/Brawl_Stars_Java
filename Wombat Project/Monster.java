import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        randomMovement();
        eatAll();
    } 
    
    
    public void randomMovement() 
    {
        int x = (int)(Math.random()*4);
        if(x == 0)
        {
            setLocation(getX()+1,getY());
        }
        if(x == 1)
        {
            setLocation(getX()-1,getY());
        }
        if(x == 2)
        {
            setLocation(getX(),getY()-1);
        }
        if(x == 3)
        {
            setLocation(getX(),getY()+1);
        }
    }

    /**
     * Eat a leaf.
     */
    public void eatAll()
    {
        if(isTouching(Snake.class))
        {
            removeTouching(Snake.class);

        }
        
        if(isTouching(Brawler.class))
        {
            removeTouching(Brawler.class);

        }
        
        
        if(getWorld().getObjects(Brawler.class).size()==0)
        {
            getWorld().showText("You lose",10,5);
            Greenfoot.stop();
        }
    }
    
}
