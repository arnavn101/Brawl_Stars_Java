import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class HulkWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HulkWombat extends Wombat
{
    int lifeSpan = 100;
    /**
     * Act - do whatever the HulkWombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        super.act();// Add your action code here.
        hulkSmash();
        lifespan();
        
    }    

    public void lifespan()
    {
        lifeSpan--;
        if(lifeSpan<0){
            getWorld().removeObject(this);
        }
    }

    public void hulkSmash()
    {
        if(Greenfoot.isKeyDown("s"))
        {
            List<Snake> snakeList = getWorld().getObjects(Snake.class);

            for(int i=0; i<snakeList.size();i++)
            {
                Skull skull = new Skull();
                Snake temp = snakeList.get(i);
                getWorld().addObject(skull,temp.getX(),temp.getY());

            }

            getWorld().removeObjects(snakeList);
        }
    }
}
