package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class ThunderAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Thunder Attack! SP -100!");
    }
}
