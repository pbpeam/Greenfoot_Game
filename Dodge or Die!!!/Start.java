import greenfoot.*;

public class Start extends World
{
    public Start()
    {    
        super(748, 826, 1); 
    }
    
    public static GreenfootSound opening = new GreenfootSound("Opening.mp3");
    public void act()
    {
        opening.play();
        start();
        //Score.score = 0;
    }
    
    public void start(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
            opening.stop();
        }
    }
}