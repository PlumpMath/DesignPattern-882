package edu.vincebarry.strategy.Custom;

/**
 * Created by VinceBarry on 2016/8/31.
 */
public class IronMan extends Hero {
    public IronMan(){
        attackBehavior = new FireAttack();
        //因为伴随着装备的完成，攻击技能一并完成。
    }
    @Override
    public void display() {
        System.out.println("IronMan:A man which uses technology to fight.");
    }
}
