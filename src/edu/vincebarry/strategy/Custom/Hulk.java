package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class Hulk extends Hero {
     public Hulk(){
         attackBehavior = new CrazyStampede();
     }
    @Override
    public void display() {
        System.out.println("Hulk:He is a scientist but after variating he becomes a big master.");
    }
}
