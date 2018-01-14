package jp.ac.uryukyu.ie.e175729;

//特攻、特防、素早さを新たに登録
public class Status {private String name;
    private double hitPoint;
    private double attack;
    private double defense;
    private double special_attack;
    private double special_defence;
    private double speed;
    private boolean dead;

    public Status (String name, double maximumHP, double attack, double defense ,double special_attack ,double special_defence,double speed) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        this.defense = defense;
        this.special_attack = special_attack;
        this.special_defence = special_defence;
        dead = false;
    }
    public boolean isDead() {
        return dead;
    }

    public String getName(){
        return name;
    }



    public void wounded(double damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた!\n", name);
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHitPoint(){
        return hitPoint;
    }
    public void setHitPoint(double hitPoint){
        this.hitPoint = hitPoint;
    }
    public double getAttack(){ return attack; }
    public void setAttack(double attack){
        this.attack = attack;
    }
    public double getDefense(){ return defense;}
    public void setDefense(double defense){this.defense = defense;}
    public double getSpecial_Attack(){return special_attack;}
    public void setSpecial_Attack(double special_Attack){this.special_attack = special_attack;}
    public double getSpecial_defence(){return  special_defence;}
    public void setSpecial_defence(double special_defence){this.special_defence = special_defence;}
    public double getSpeed(){return speed;}
    public void setSpeed(double speed){this.speed = speed;}
    public void setDead(boolean dead){
        this.dead = dead;
    }
}
