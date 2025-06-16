package kadai2;

public class Hero2 extends Character2 {
    public void attack(Matango2 m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 10;
        System.out.println("敵に10ダメージを与えた");
    }
}
