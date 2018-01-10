package jp.ac.uryukyu.ie.e175729;

public class Rival extends Status{
    public Rival(String name, double maximumHP, double attack, double defence,double special_attack ,double special_defence,double speed) {
        super(name, maximumHP, attack,defence,special_attack,special_defence,speed);


    }
    public void attack(Status opponent){
        if(isDead() != true){

            int damage = (int)(Math.random() * getAttack());
            int probability = (int)(Math.random()*100) + 1;
            if (damage == 0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName(), damage);

            }else{
                if (probability < 31){
                    damage = damage * 2;
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);

                }else{
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);

                }
                opponent.wounded(damage);            }
        }}


    @Override
    public void wounded(double damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() <= 0) {
            setDead(true);

            System.out.printf("モンスター%sは倒れた。", getName());
        }
    }
    public void Tail_Whip() {
        setSpeed(getDefense() * 0.67);
        System.out.println(getName() + "のぼうぎょが一段階下がった！");
    }
}
