package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class HeroSimulator {
    public static void main(String args[]){
        Hero ironMan = new IronMan();
        ironMan.display();
        ironMan.walking();
        ironMan.performAttack();
        //为钢铁侠指定一下武器
        ironMan.setWeapon(new Gun());
        ironMan.useWeapon();
        ironMan.setWeapon(new Sword());
        ironMan.useWeapon();
        Hero hulk = new Hulk();
        hulk.display();
        hulk.walking();
        hulk.setWeapon(new NoWeapon());
        hulk.useWeapon();
        hulk.performAttack();
        Hero thor = new Thor();
        thor.display();
        thor.walking();
        thor.performAttack();
        thor.setWeapon(new Hammer());
        thor.useWeapon();
    }
}
