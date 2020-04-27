import greenfoot.*;

public class Knife extends Actor
{
    GreenfootImage x = new GreenfootImage("Red-x.png");
    public void act() 
    {
        GreenfootImage Knife = getImage();
        Knife.scale(100,100);
        setLocation( getX(), getY() + 20); 
        
        if(getY() > 810){
            getWorld().removeObject(this);
        }
    }    
}
