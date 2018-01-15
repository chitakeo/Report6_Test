package jp.ac.uryukyu.ie.e175729;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Hero hero = new Hero("ピカチュウ", 142, 107, 92, 102, 102, 142);
        Rival rival = new Rival("スライム", 248, 132, 55, 100, 100, 140);

        System.out.printf("%s vs. %s\n", hero.getName(), rival.getName());

        int turn = 0;


        while (!hero.isDead()&&rival.isDead() == false) {

            turn++;
            int order = (int) Math.random() * 2 + 1;
            System.out.printf("%dターン目開始！\n", turn);


            //それぞれのgetSpeedを比較し攻撃する順番を決定
            if (hero.getSpeed() > rival.getSpeed()) {

            Instruction(rival,hero);
            rival.attack(hero);
            }else {
                if (hero.getSpeed() < rival.getSpeed()){
                    rival.attack(hero);
                    Instruction(rival,hero);
                }else {
                    if (order < 2){
                        Instruction(rival,hero);
                        rival.attack(hero);
                }else {
                        rival.attack(hero);
                        Instruction(rival,hero);////
            }}}}
                System.out.println("戦闘終了");}







    //入力文と対応する技を探し、一致したらPerformanceクラスから引き出す。
    public static void Instruction (Rival rival,Hero hero) {
        String input = "";
        Scanner in = new Scanner(System.in);
        Scanner yo = new Scanner(System.in);
        input = yo.nextLine();
        System.out.printf(hero.getName() + "の" + input + "!");

        Performance performance = new Performance();
        if (input.equals("しっぽをふる") == true) {
            performance.Tail_Whip(rival);
        } else {
            if (input.equals("でんきショック") == true) {
                performance.Thundershock(hero,rival);
            }
            if (input.equals("10まんボルト") == true){
                performance.Thunderbolt(hero,rival);
            }
            if (input.equals("アイアンテール") == true){
                performance.Iron_Tail(hero,rival);
            }
            if (input.equals("ボルテッカー")== true){
                performance.Volt_Tackle(hero,rival);
            }
            if (input.equals("ひっさつのピカチュート")== true){
                performance.Catastropika(hero,rival);
            }
            if (input.equals("なきごえ")== true){
                performance.Growl(rival);
            }
            if (input.equals("ワイルドボルト")== true){
                performance .Wild_Charge(hero,rival);
            }
        }
    }
}

