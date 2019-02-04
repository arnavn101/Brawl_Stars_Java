import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
// import libraries
/**
 * Write a description of class primo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class primo extends Brawler
{
    
    // initialize variables for jump
    boolean bool;
    double Force = 0;
    double Gravity = 0.5;
    double extreme = -6;
    int Wait = 0;
    private String lastKey;
    private Boolean isJumped = false;

    public void act()
    {
        super.act();
        jump();
        bool = super.takeGem();
    }

    
     public void jump(){
        
        if(Greenfoot.isKeyDown("j") && bool == true){
            
            // changes location of Brawler with 
            setLocation( getX(), (int)(getY() + Force) );
            lastKey = Greenfoot.getKey();
            
            if(lastKey!=null && lastKey.equals("up") == true && isJumped == true) {
                isJumped = false;
            }
            if(Greenfoot.isKeyDown("up") == true && isJumped == false) {
                isJumped = true;
                Wait++;
                // make the brawler jump high by increasing the force and change location
                Force = extreme;
                if(Wait >= 8)
                {   
                    setLocation( getX(), (int)(getY() + 1) );
                    Wait = 0;
                } 
            }
            
            // apply gravity to simulate Brawler's fall after jump
            
            Force = Force + Gravity;
            
            // make a list of near snake objects
            
            List<Snake> nearActors = getObjectsInRange(5, Snake.class);  
            Actor nearestActor = null;  
            double nearestDistance = 2;  
            double distance;   
            
            // go through the loop to find nearest actors & remove actors near the Brawler
            for (int i = 0; i < nearActors.size(); i++)  
            {  
                distance = (Math.sqrt(Math.pow(this.getX() - (nearActors.get(i)).getX(), 2) + Math.pow(this.getY() - (nearActors.get(i)).getY(), 2)));
                if(distance < nearestDistance)
                {
                    nearestActor = nearActors.get(i);  
                    nearestDistance = distance;  
                }
                try{
                    if (nearestActor !=null)
                    {
                        getWorld().addObject(new Explosion(), nearestActor.getX(), nearestActor.getY());
                        getWorld().removeObject(nearestActor);
                    }}
                catch (Exception e) {
                    return;
                }
            }}}
} 

