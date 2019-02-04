import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * A world where wombats live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class WombatWorld extends World
{
    int counter = 0;
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    public WombatWorld() 
    {
        super(20,12,60);        
        setBackground("cell.jpg");
        setPaintOrder(Wombat.class, Leaf.class);
        prepare();
        act();

    }

    public void act()
    {

        if( counter == 0)
        {
            showText("Win Condition: Collect all the leaves & gems \n"+
                "Losing Condtions: Get eaten by a snake or Leon \n"+
                "Primo Controls: Arrow keys to move \n"+
                "Shelley Controls: WSAD keys to move \n"+
                "Primo Brawler: J & Up arrow- Jump up (Down arrow & J to jump down) \n"+
                "Shelly Brawler: B - Shoot\n"+
                "Hint: Use Shelly & keep shooting to win\n"+
                "COLLECT 2 GEMS to use special abilites",5,1);
               
        }
        else
        {
            showText("",5,1); //Resets text to an empty string
        }
        counter++;

       

    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {

    }

    private void prepare()
    {

        Brawler brawler = new Brawler();
        addObject(brawler,2,6);
        Leaf leaf = new Leaf();
        addObject(leaf,5,4);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,5,8);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,8,6);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,9,1);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,11,10);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,2,8);
        Leaf leaf7 = new Leaf();
        addObject(leaf7,11,5);
        Leaf leaf8 = new Leaf();
        addObject(leaf8,16,1);
        Leaf leaf9 = new Leaf();
        addObject(leaf9,19,5);
        Leaf leaf10 = new Leaf();
        addObject(leaf10,18,10);
        Leaf leaf11 = new Leaf();
        addObject(leaf11,15,11);
        Leaf leaf12 = new Leaf();
        addObject(leaf12,15,5);
        Leaf leaf13 = new Leaf();
        addObject(leaf13,12,1);
        Snake snake = new Snake();
        addObject(snake,15,1);
        Snake snake2 = new Snake();
        addObject(snake2,12,10);
        removeObject(brawler);
        Shelley shelley = new Shelley();
        addObject(shelley,1,4);
        removeObject(shelley);
        primo primo = new primo();
        addObject(primo,1,4);
        leon leon = new leon();
        addObject(leon,11,4);
        leon leon2 = new leon();
        addObject(leon2,6,5);
        leon leon3 = new leon();
        addObject(leon3,14,9);
        Shelley shelley2 = new Shelley();
        addObject(shelley2,18,5);
        leaf9.setLocation(19,5);
        gem gem = new gem();
        addObject(gem,2,3);
        leaf6.setLocation(2,8);
        gem gem2 = new gem();
        addObject(gem2,2,8);
        gem gem3 = new gem();
        addObject(gem3,9,9);
        gem gem4 = new gem();
        addObject(gem4,10,3);
        gem gem5 = new gem();
        addObject(gem5,12,2);
        gem gem6 = new gem();
        addObject(gem6,18,1);
        gem gem7 = new gem();
        addObject(gem7,10,1);
        gem gem8 = new gem();
        addObject(gem8,4,10);
        gem gem9 = new gem();
        addObject(gem9,8,11);
        gem gem10 = new gem();
        addObject(gem10,17,11);
        gem gem11 = new gem();
        addObject(gem11,13,8);
        gem gem12 = new gem();
        addObject(gem12,16,3);
        removeObject(gem3);
        removeObject(gem9);
        removeObject(gem4);
        removeObject(leaf6);
        removeObject(gem12);
        gem gem13 = new gem();
        addObject(gem13,2,5);
        gem gem14 = new gem();
        addObject(gem14,2,4);
        shelley2.setLocation(0,5);
        primo.setLocation(18,5);
        shelley2.setLocation(1,4);
        leon2.setLocation(9,6);
        leon2.setLocation(6,5);
        gem gem15 = new gem();
        addObject(gem15,17,4);
        gem gem16 = new gem();
        addObject(gem16,17,5);
        gem gem17 = new gem();
        addObject(gem17,17,6);

        Darryl darryl = new Darryl();
        addObject(darryl,8,9);
        removeObject(darryl);
        leaf2.setLocation(5,8);
        Darryl darryl2 = new Darryl();
        addObject(darryl2,5,8);
        darryl2.setLocation(4,7);
        darryl2.setLocation(4,8);
        darryl2.setLocation(4,8);
        removeObject(leon2);
        removeObject(leon);
        primo.setLocation(5,2);
        Shelley shelley3 = new Shelley();
        addObject(shelley3,7,3);
        primo primo2 = new primo();
        addObject(primo2,11,3);
        Shelley shelley4 = new Shelley();
        addObject(shelley4,12,6);
        removeObject(leon3);
        removeObject(shelley3);
        shelley2.setLocation(0,0);
        shelley2.setLocation(0,1);
        primo.setLocation(19,11);
        primo.setLocation(18,9);
        removeObject(leaf10);
        gem17.setLocation(9,10);
        gem14.setLocation(9,4);
        gem.setLocation(7,3);
        leon leon4 = new leon();
        addObject(leon4,14,3);
        leon leon5 = new leon();
        addObject(leon5,6,5);
        leon leon6 = new leon();
        addObject(leon6,8,9);
        leon leon7 = new leon();
        addObject(leon7,0,6);
        leaf12.setLocation(15,5);
        Snake snake3 = new Snake();
        addObject(snake3,15,5);
        removeObject(shelley4);
        gem gem18 = new gem();
        addObject(gem18,1,1);
        gem gem19 = new gem();
        addObject(gem19,1,2);
        darryl2.setLocation(6,3);
        darryl2.setLocation(9,2);
        removeObject(leon7);
        darryl2.setLocation(7,2);
        darryl2.setLocation(9,3);
        Darryl darryl3 = new Darryl();
        addObject(darryl3,5,11);
        Darryl darryl4 = new Darryl();
        addObject(darryl4,17,6);
        darryl3.setLocation(4,9);
        leon leon8 = new leon();
        addObject(leon8,0,6);
        gem19.setLocation(4,1);
        primo2.setLocation(12,4);
        removeObject(primo2);
        primo.setLocation(19,10);
        darryl4.setLocation(11,6);
        removeObject(darryl4);
        darryl3.setLocation(4,9);
        darryl2.setLocation(10,6);
        leon5.setLocation(4,3);
        gem16.setLocation(13,5);
        gem11.setLocation(17,10);
        darryl3.setLocation(6,8);
        gem gem20 = new gem();
        addObject(gem20,1,2);
        leon8.setLocation(3,9);
        snake3.setLocation(14,6);
        snake2.setLocation(11,11);
        leon5.setLocation(6,5);
    }
}

