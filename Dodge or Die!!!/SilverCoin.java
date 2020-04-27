import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SilverCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SilverCoin extends Actor
{
    /**
     * Act - do whatever the SilverCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Image();
        Remove();
    }
    
    public void Remove(){
        if(getY() > 810){
            getWorld().removeObject(this);
        }
    }
    
    public void Image(){
        GreenfootImage Silver = getImage();
        Silver.scale( 30, 30);
        
        setLocation( getX(), getY() + 10); 
    }
}
