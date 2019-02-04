import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Wombat. A Wombat moves forward until it can't do so anymore, at
 * which point it turns left. If a wombat finds a leaf, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Brawler extends Actor
{
    int leavesEaten;
    int gem;
    public Brawler()
    {
        leavesEaten = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        movement();
        takeGem();
        eatLeaf();
        

    }

    public void movement()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-1,getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+1);
        }

    }

    /**
     * Eat a leaf.
     */
    public void eatLeaf()
    {
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            leavesEaten++;
        }

        if(getWorld().getObjects(Leaf.class).size()==0)
        {
            getWorld().showText("Brawler Win!!",10,5);
            Greenfoot.stop();
        }

    }
    
    public int returnGem(){
        
        return gem;
    }
    public boolean takeGem()
    {
        if(isTouching(gem.class))
        {
            removeTouching(Leaf.class);
            gem++;
        }
        if(gem > 1)
        {
            return true;
        }
        return false;
    }
}