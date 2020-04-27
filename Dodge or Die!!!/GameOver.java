import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    GreenfootSound endTheme;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(748, 826, 1);
        
        ShowScore Score = new ShowScore();
        addObject(Score, getWidth()/2 , 500);
        
        endTheme = new GreenfootSound("GameOver.mp3");
        //World world = getWorld();
        //world.showText("Your Score is " + Score.score, world.getWidth()/2, 500);
    }
    
    public void act(){
        //Restart();
        endTheme.play();
        Restart();
        //stop();
    }
    
    public void stop(){
        endTheme.stop();
    }
    
    public void Restart(){
        if(Greenfoot.isKeyDown("r")){
              Greenfoot.setWorld(new MyWorld());
              endTheme.stop();
              Score.score = 0;
        }
    }
}
