import greenfoot.*;
import greenfoot.Color;
 
public class Score extends Actor
{
    public static int score = 0;
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.BLACK, new Color(0,0,0,0)) );
    }    
}
