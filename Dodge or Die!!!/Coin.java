import greenfoot.*;

public class Coin extends Actor
{
    public void act() 
    {
        Image();
        Remove();
        //getScore();
    }
    
    public void Remove(){
        if(getY() > 810){
            getWorld().removeObject(this);
        }
    }
    
    //public void getScore(){
    //    if(getOneIntersectingObject(Flamingo.class) != null){
    //        getWorld().removeObject(this);
    //    }
    //}
    
    public void Image(){
        GreenfootImage Coin = getImage();
        Coin.scale( 30, 30);
        
        setLocation( getX(), getY() + 10); 
    }
}
