import greenfoot.*;

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    int life;
    public Explosion()
    {
        life =10;
    }

    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        killSnake();
        lifeSpan();
    }    

    public void killSnake()
    {
        try{
        if(isTouching(Snake.class) )
            removeTouching(Snake.class);
        
        }
        catch (Exception e) {
            return;
        }
    }

    public void lifeSpan()
    {
        life--;
        if(life == 0)
        {
            getWorld().removeObject(this);

        }
    }
}
