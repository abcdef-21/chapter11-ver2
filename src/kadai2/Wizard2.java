package kadai2;

public class Wizard2 extends Character2 {
    public void attack(Matango2 m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("魔法使いは火の玉を放った！");
        m.hp -= 7;
        System.out.println("敵に7のダメージをあたえた！");
    }
}
