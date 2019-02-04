import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Wombat. A Wombat moves forward until it can't do so anymore, at
 * which point it turns left. If a wombat finds a leaf, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Wombat extends Actor
{
    int leavesEaten;
    public Wombat()
    {
        leavesEaten = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        movement();
        eatLeaf();
        hulkTransform();

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
            getWorld().showText("Wombat Win!!",10,5);
            Greenfoot.stop();
        }

    }

    public void hulkTransform()
    {
        if(leavesEaten>4)
        {
            HulkWombat hulk = new HulkWombat();
            getWorld().addObject(hulk,getX(),getY());
            getWorld().removeObject(this);
        }

    }
    

}