package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class NoWeapon implements Weapon {
    @Override
    public void beUsed() {
        System.out.println("No weapon!");
    }
}
