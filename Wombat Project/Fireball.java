import greenfoot.*;

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private int lifeSpan = 0;
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }    

    public void movement()
    {
        if(lifeSpan > 600)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Actor.class))
            {
                removeTouching(Actor.class);
                
            }
        else
        {
                setLocation(getX()+1,getY());
                lifeSpan++;
            }
        }
    }
