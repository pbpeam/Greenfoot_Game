import greenfoot.*;


public class Sword extends Actor
{
    GreenfootImage x = new GreenfootImage("Red-x.png");
    public void act() 
    {
        Image();
        Remove();
    }
    
    public void Image(){
        GreenfootImage Sword = getImage();
        Sword.scale(100,100);
        setLocation( getX(), getY() + 15); 
    }
    
    public void Remove(){
        if(getY() > 810){
            getWorld().removeObject(this);
        }
    }
}
