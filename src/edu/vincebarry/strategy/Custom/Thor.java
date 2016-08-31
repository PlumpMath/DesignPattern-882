package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class Thor extends Hero {
    public Thor(){
        attackBehavior = new ThunderAttack();
    }
    @Override
    public void display() {
        System.out.println("Thor:He is a god which can control thunder.");
    }
}
