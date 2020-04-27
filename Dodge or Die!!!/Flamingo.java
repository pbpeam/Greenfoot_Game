import greenfoot.*; 

public class Flamingo extends Actor
{
   private int image;
   private int direction;
   GreenfootImage[] right = new GreenfootImage[36];
   GreenfootImage[] left = new GreenfootImage[36];
   
    public Flamingo(){
        GreenfootImage Flamingo = getImage();
        for (int i=0; i<36; i++){
            right[i] = new GreenfootImage("Flamingo/Flamingo"+ (i+1) +".png");
            left[i] = new GreenfootImage("Flamingo/Flamingo"+ (i+1) +".png");
            
            right[i].scale(100,150);
            left[i].scale(100,150);
            
            left[i].mirrorHorizontally();
        }
        setImage(right[0]);
    }
        
    public void act() 
    {
        Control();
        Image();
        GameOver();
        getScore();
        //Restart();
    }    
    
    private int speed =7;
    public void Control(){
      if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
            image +=1;
            direction = -1;
      }
        
      if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
            image +=1;
            direction = 1;
      }  
    }
    
    public void Image(){       
        if(image >= 36) image -=36;
        
        if(image < 0)image +=36;
        
        if(direction == 1){
            setImage(right[image]);
        }
        else{
            setImage(left[image]);
        }
    }
    
    public void GameOver(){
        Actor Sword = getOneObjectAtOffset(0,0,Sword.class);
        Actor Knife = getOneObjectAtOffset(0,0,Knife.class);
        
    
        if(Knife != null || Sword != null){
            //World world = getWorld();
            //world.removeObjects(world.getObjects(null));
            //world.addObject(new GameOver(), world.getWidth()/2, world.getHeight()/3);
            //world.showText("Your Score is " + Score.score, world.getWidth()/2, 500);
            //world.addObject(new Restart(), world.getWidth()/2, 650);
            Greenfoot.setWorld(new GameOver());
            
            //Score.score = 0;  
            
            new GreenfootSound("Slash.wav").play();
            MyWorld.mainTheme.stop();
            
        }
    }
    
    public void getScore(){
        if(isTouching(Coin.class) == true){
            removeTouching(Coin.class);
            Score.score+=10;
            new GreenfootSound("getCoin.mp3").play();
        }
        
        if(isTouching(SilverCoin.class) == true){
            removeTouching(SilverCoin.class);
            Score.score+=5;
            new GreenfootSound("getCoin.mp3").play();
        }
        //getCoin.play();
        
    }
    
    public void Restart(){
        if(Greenfoot.isKeyDown("r")){
                Greenfoot.setWorld(new MyWorld());
        }
    }
}
