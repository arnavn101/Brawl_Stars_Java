import greenfoot.*;  
import java.util.List;
public class Bullet extends Actor
{
    int life_monster = 5;
    public Bullet(){
        
    }
    
    public void act() 
    {
        move(2);
        hitPlayer();
        hitMonster();
        hitEdges();
        if(getWorld() == null) 
            return; 
    }
    
    
    
    private void hitPlayer()
    {
        
        // if there is an intersecting snake, remove it
        Actor player = getOneIntersectingObject(Snake.class);
        if (player !=null)
        {
            getWorld().addObject(new Skull(), player.getX(), player.getY());
            getWorld().removeObject(player);
            getWorld().removeObject(this);
            return;
        }
    }
    private void hitMonster(){
        
        // if there is an intersecting monster, remove it
        try{
        Actor player = getOneIntersectingObject(Monster.class);
        
        
        
        if (player !=null)
        {
            
            
            getWorld().addObject(new Skull(), player.getX(), player.getY());
            getWorld().removeObject(player);
            getWorld().removeObject(this);
        
        
        
            
        }}
        catch (Exception e) {
           
        }
        }
        
    
    private void hitEdges()  
    {  
        // remove it if it hits edges
        try{
        if (getX() == getWorld().getWidth()-1) 
            getWorld().removeObject(this);
        }
        catch (Exception e) {
            return;
        }
    }
}
   
