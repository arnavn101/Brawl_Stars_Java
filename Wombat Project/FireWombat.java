import greenfoot.*;


public class FireWombat extends Wombat
{

    public FireWombat()
    {

    }

    /**
     * Act - do whatever the FireWombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        shootFire();
        explosion();
    }

    public void shootFire()
    {
        Fireball fireball = new Fireball();
        if(Greenfoot.isKeyDown("d"))
        {
            getWorld().addObject(fireball,getX(),getY());
        }
    }

    /**
     * An explosion object is set to all adjacent squares killing all snakes in the immediate area.
     */
    public void explosion()
    {
        Explosion explosion1 = new Explosion();
        Explosion explosion2 = new Explosion();
        Explosion explosion3 = new Explosion();
        Explosion explosion4 = new Explosion();
        if(Greenfoot.isKeyDown("a"))
        {
            getWorld().addObject(explosion1,getX()+1,getY());
            getWorld().addObject(explosion2,getX()-1,getY());
            getWorld().addObject(explosion3,getX(),getY()+1);
            getWorld().addObject(explosion4,getX(),getY()-1);

        }
    }
}
