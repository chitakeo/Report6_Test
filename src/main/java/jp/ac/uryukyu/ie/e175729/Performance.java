package jp.ac.uryukyu.ie.e175729;

public class Performance {


    public void Tail_Whip(Status opponent) {
        setSpeed(getDefense() * 0.67);
        System.out.println(getName() + "のぼうぎょが一段階下がった！");
    }
    public void Thundershock(Status opponent){
        double damage = (22*getSpecial_Attack()*40/opponent.getSpecial_defence()/50+2)*((Math.random()*0.25)+0.85);
        opponent.wounded(damage);
    }
}

