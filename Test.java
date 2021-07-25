package game.sunhan001;
import java.util.Random;
public class Test {
    public static void main(String[] args){
        Random rd =new Random();
        int index=rd.nextInt(2);
        Players dc=new Players();
        Players dj=new Players();

        //貂蝉的个人属性；
        dc.name="貂蝉";
        String[] skills1={"一技能:放花","二技能:位移","三技能:回血"};
        dc.skills=skills1;
        double[] skillHurts1={50,70,80};
        dc.skillHurts=skillHurts1;

        //妲己的个人属性;
        dj.name="妲己";
        String[] skills2={"一技能:一刀","二技能:控制","三技能:发射小爱心"};
        dj.skills=skills2;
        double[] skillHurts2={50,70,80};
        dj.skillHurts= skillHurts2;

        //攻击
        while(true){
            if(index==1){
                dj.attack(dc);
                if(dj.hp<=0){
                    System.out.println(dj.name+"血量不足,无法攻击,"+dc.name+"获胜!");
                    break;
                }
                dj.attack(dc);
                if(dc.hp<=0){
                    System.out.println(dc.name+"血量不足,无法攻击,"+dj.name+"获胜!");
                    break;
                }
            }
            else{
                dc.attack(dj);
                if(dj.hp<=0){
                    System.out.println(dj.name+"血量不足,无法攻击,"+dc.name+"获胜!");
                    break;

                }
            }
        }




    }
}
