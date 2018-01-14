package jp.ac.uryukyu.ie.e175729;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RivalTest {
    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テストピカチュウ", heroHP, 134,98,151,100,155);
        Rival rival = new Rival("テストスライム", 233, 55,122,0,0,67);
        rival.setDead(true);
        for(int i=0; i<10; i++) {
            rival.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }

}