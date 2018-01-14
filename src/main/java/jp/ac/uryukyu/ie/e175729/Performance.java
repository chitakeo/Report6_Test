package jp.ac.uryukyu.ie.e175729;

public class Performance {


    public void Tail_Whip(Rival opponent) {
        opponent.setDefense(opponent.getDefense() * 0.67);
        System.out.println(opponent.getName() + "のぼうぎょが一段階下がった！");
    }
    public void Thundershock(Hero attacker ,Rival opponent){
        double damage = (22*attacker.getSpecial_Attack()*40/opponent.getSpecial_defence()/50+2)*((Math.random()*0.25)+0.85);
        opponent.wounded(damage);
    }
    public void Thunderbolt(Hero attacker , Rival opponent){
        double damege = (22*attacker.getSpecial_Attack()*90/opponent.getSpecial_defence()/50+2)*((Math.random()*0.25)+0.85);
        opponent.wounded(damege);
    }
    public void Wild_Charge(Hero attacker , Rival opponent){
        double damege = (22*attacker.getAttack()*90/opponent.getDefense()/50+2)*((Math.random()*0.25)+0.85);
        opponent.wounded(damege);
    }
    public void Iron_Tail(Hero attacker , Rival opponent){
        double damege = (22*attacker.getAttack()*75/opponent.getDefense()/50+2)*((Math.random()*0.25)+0.85);
        opponent.wounded(damege);
    }
    public void Volt_Tackle(Hero attacker , Rival opponent){
        double damege = (22*attacker.getAttack()*120/opponent.getDefense()/50+2)*((Math.random()*0.25)+0.85);
        double recoil = damege*(1/3);
        opponent.wounded(damege);
        attacker.wounded(recoil);
    }
    public void Catastropika(Hero attacker , Rival opponent){
        double damege = (22*attacker.getAttack()*210/opponent.getDefense()/50+2)*((Math.random()*0.25)+0.85);
        opponent.wounded(damege);
    }
    public void Growl(Rival opponent){
        opponent.setAttack(opponent.getAttack()*0.67);
        System.out.print(opponent.getName() + "のこうげきが一段階下がった！");
    }

}

