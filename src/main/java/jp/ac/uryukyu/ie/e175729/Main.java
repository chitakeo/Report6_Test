package jp.ac.uryukyu.ie.e175729;
import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {
        String input = "";
        Scanner in = new Scanner(System.in);

        Hero hero = new Hero("ピカチュウ", 433, 100, 100, 100, 100, 100);
        Rival rival = new Rival("オルゴデミーラ", 566, 23, 100, 100, 100, 100);

        System.out.printf("%s vs. %s\n", hero.getName(), rival.getName());

        int turn = 0;


        while (!hero.isDead() && rival.isDead() == false) {
            Scanner yo = new Scanner(System.in);
            input = yo.nextLine();
            turn++;
            int order = (int) Math.random() * 2 + 1;
            System.out.printf("%dターン目開始！\n", turn);
            System.out.printf(hero.getName() + "の" + input + "!");
            if (hero.getSpeed() > rival.getSpeed()) {
                Instruction(input);
                rival.attack(hero);
            }else {
                if (hero.getSpeed() < rival.getSpeed()){
                    rival.attack(hero);
                    Instruction(input);
                }else {
                    if (order < 2){
                        Instruction(input);
                        rival.attack(hero);
                }else {
                        rival.attack(hero);
                        Instruction(input);
            }
            System.out.println("戦闘終了");
        }
    }
    }
    }
    public static void Instruction(String input) {

        Hero hero = new Hero("ピカチュウ", 100, 100,100,100,100,100);
        Rival rival = new Rival("オルゴデミーラ", 100,100,100,100,100,100);

        if (input.equals("しっぽをふる") == true) {
            rival.Tail_Whip();
        } else {
            if (input.equals("でんきショック") == true) {
                hero.(rival);
            }
        }
    }
}

