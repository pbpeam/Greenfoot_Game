import greenfoot.*;

public class ShowScore extends Actor
{
    public void act() 
    {
        setImage(new GreenfootImage("Your Score\n" + Score.score, 50, Color.BLACK, new Color(0,0,0,0)) );
    }    
}
