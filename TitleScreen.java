import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Marcus
 * @version march 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);

        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,380,98);
        Label label = new Label("press <space> to start", 40);
        addObject(label,254,266);
        label.setLocation(290,245);
        label.setLocation(220,245);
        label.setLocation(304,312);
        Label label2 = new Label("use \u2190 and \u2192 to move", 40);
        addObject(label2,306,265);
    }
}
