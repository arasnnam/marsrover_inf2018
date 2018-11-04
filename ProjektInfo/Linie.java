import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Linie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linie extends Actor
{
    private Display anzeige;
     public Linie()
    {
        setImage("images/Linie.png");
    }
    /**
     * Act - do whatever the Linie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
        }
        else
        {
            nachricht("Befehl nicht korrekt!");
        }
    }
    
    private void nachricht(String pText)
    {
        if(anzeige!=null)
        {
            anzeige.anzeigen(pText);
            Greenfoot.delay(1);
            anzeige.loeschen();
        }
    }
    class Display extends Actor
    {
    GreenfootImage bild; 
    
        public Display()
        {
            bild = getImage();
        }
        
    public void anzeigen(String pText)
        {
            loeschen();
            bild = new GreenfootImage(pText, 30, null, null); 
            getImage().drawImage(bild, 8,0);

        }
        
        public void loeschen()
        {
            getImage().clear();
            setImage("images/nachricht.png");
        }
}}
