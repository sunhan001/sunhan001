package game.sunhan001;
import java.util.Random;
public class Players {
    String name;//名字
    String [] skills;//技能
    double [] skillHurts;//技能伤害
    double hp=700;//初始血量

    public void attack(Players otherPlayers){
        Random rd = new Random();//随机生成一个数
        int index=rd.nextInt(skills.length);//用生成的随机数在列表里选择一个技能
        String skill;//用随机数选取一个技能来
        skill = skills[index];
        double skillHurt=skillHurts[index];//用随机数，选出英雄对应的技能伤害
        otherPlayers.hp-=skillHurt;
        System.out.println(name+"使用了"+skill+"技能，对"+otherPlayers.name+"造成了"+skillHurt+"点伤害"+otherPlayers.name+"还剩"+otherPlayers.hp+"血量");

    }


}
