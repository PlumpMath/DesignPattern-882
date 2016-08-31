package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class FireAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("FireAttack! SP-100");
    }
}
