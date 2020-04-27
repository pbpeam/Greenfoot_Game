import greenfoot.*;  

public class MyWorld extends World
{
    public static GreenfootSound mainTheme;
    public MyWorld()
    {    
        super(748, 826, 1);
        
        Flamingo Flamingo = new Flamingo();
        addObject(Flamingo, getWidth()/2,730);
        
        Score();
        
        mainTheme = new GreenfootSound("MainTheme.mp3");
    }    
    
    public void act(){
       falling();
       CoinFall();
       mainTheme.play();
    }
    
    public void falling(){
        if(Greenfoot.getRandomNumber(100) < 5){
           Sword Sword = new Sword();
           addObject(Sword, Greenfoot.getRandomNumber(getWidth()),0);
        }
        
       if(Greenfoot.getRandomNumber(100) < 1){
           Knife Knife = new Knife();
           addObject(Knife, Greenfoot.getRandomNumber(getWidth()),0);
        }
       
    }
    
    public void CoinFall(){
        if(Greenfoot.getRandomNumber(250) < 3){
           Coin Coin = new Coin();
           addObject(Coin, Greenfoot.getRandomNumber(getWidth()), 0);
        }
       
       if(Greenfoot.getRandomNumber(100) < 3){
           SilverCoin Silver = new SilverCoin();
           addObject(Silver, Greenfoot.getRandomNumber(getWidth()), 0);
       }
    }
    
    public void Score(){
        Score Score = new Score();
        addObject(Score, 650, 40);
    }
}
