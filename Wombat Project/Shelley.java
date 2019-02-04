import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shelley here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shelley extends Brawler
{
    boolean bool;
    int health;
    
    /**
     * Act - do whatever the Shelley wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        shoot();
        bool = super.takeGem();
    }
    
    
    
    
    public void shoot(){
        
        // creates a bullet and runs the method once B is pressed
        Bullet bullet = new Bullet();
        if(Greenfoot.isKeyDown("b") && bool == true)
        {
            getWorld().addObject(bullet,getX(),getY());
        }
        
    }
    
    public void movement()
    {
        
        // simulates movement of Brawler
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-1,getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+1);
        }

    }
}
