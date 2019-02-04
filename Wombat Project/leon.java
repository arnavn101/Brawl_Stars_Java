import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class leon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leon extends Snake
{
    /**
     * Act - do whatever the leon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        invisibility();
    }
    
    public void invisibility(){
        
        getImage().setTransparency(0);   
        
        
        List<Brawler> nearActors = getObjectsInRange(40, Brawler.class);  
        Actor nearestActor = null;  
        double nearestDistance = 3;  
        double distance;   
        for (int i = 0; i < nearActors.size(); i++)  
        {  
            distance = (Math.sqrt(Math.pow(this.getX() - (nearActors.get(i)).getX(), 2) + Math.pow(this.getY() - (nearActors.get(i)).getY(), 2)));
            if(distance < nearestDistance)
            {
                nearestActor = nearActors.get(i);  
                nearestDistance = distance;  
        }
        
            if (nearestActor !=null)
        {
            getImage().setTransparency(100);   
        
        }}
    }
}
