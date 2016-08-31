package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public abstract class Hero {
    public AttackBehavior attackBehavior;
    public Weapon weapon;
    public abstract void display();
    public void walking(){
        System.out.println("Hero walking in the same way");
    }

    public void performAttack() {
        attackBehavior.attack();
    }
    public void useWeapon(){
        weapon.beUsed();
    }

    public void setWeapon(Weapon wp) {
        weapon = wp;
    }
}
