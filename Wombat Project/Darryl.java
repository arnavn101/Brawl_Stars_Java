import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class Darryl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darryl extends Monster
{
    int num = 0;
    public void act() 
    {
        //super.act();
        followHuman();
        //explosion();
    }

    public void followHuman()
    {
        int dist = 10;
        Actor closest = null;
        
        for(int g = 0; g<1; g++){
            
            num = num + 1;
            
        }
        if(!getObjectsInRange(dist, Brawler.class).isEmpty())
        {
            // it finds closest person using distance formula and proceeds to follow it
            for (Object obj: getObjectsInRange(dist, Brawler.class))
            {
                Actor guy = (Actor) obj;
                int guyDist = (int) Math.hypot(guy.getX() - getX(), guy.getY() - getY());
                if (closest == null || guyDist< dist)
                {
                    closest = guy;
                    dist = guyDist;
                }
            }
            // first it turns towards the Brawler and then moves towards it
            turnTowards(closest.getX(),closest.getY());
            
            if(num%3 == 0)
                move(1);
            // it removes the touching brawler
            if(isTouching(Brawler.class))
            {
                removeTouching(Brawler.class);

            }
        }   
    }

    /**
     * An explosion object is set to all adjacent squares killing all snakes in the immediate area.
     */
    public void explosion()
    {
        // causes an 
        Explosion explosion1 = new Explosion();
        Explosion explosion2 = new Explosion();
        Explosion explosion3 = new Explosion();
        Explosion explosion4 = new Explosion();
        for(int i = 0; i<10; i++)
        {
            getWorld().addObject(explosion1,getX()+1,getY());
            getWorld().addObject(explosion2,getX()-1,getY());
            getWorld().addObject(explosion3,getX(),getY()+1);
            getWorld().addObject(explosion4,getX(),getY()-1);

        }
    }   
}
