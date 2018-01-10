package jp.ac.uryukyu.ie.e175729;

public class Hero extends Status{
    public Hero(String name, double maximumHP, double attack, double defence,double special_attack ,double special_defence,double speed) {
        super(name, maximumHP, attack,defence,special_attack,special_defence,speed);


}
    @Override
    public void wounded(double damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() <= 0) {
            setDead(true);

            System.out.printf("モンスター%sは倒れた。", getName());
        }
    }
}