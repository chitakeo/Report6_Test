package jp.ac.uryukyu.ie.e175729;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
public class Main {
    public static
    void main(String[] args) {
        String input = "";
        Scanner in = new Scanner(System.in);
        Hero hero = new Hero("ピカチュウ", 142, 107, 92, 102, 102, 142);
        Rival rival = new Rival("スライム", 248, 56, 55, 100, 100, 140);

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

        }
    }

    }
    }
    public static void Instruction(String input) {

        Hero hero = new Hero("ピカチュウ", 100, 100,100,100,100,100);
        Rival rival = new Rival("オルゴデミーラ", 100,100,100,100,100,100);
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

