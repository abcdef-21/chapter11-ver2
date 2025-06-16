package kadai2;

public class Main2 {
    public static void main(String[] args) {
        // 1. 勇者と魔法使いを生成
        Hero2 h = new Hero2();
        h.name = "ミナト";
        Wizard2 w = new Wizard2();
        w.name = "アサカ";

        // 2. お化けキノコを2匹生成
        Matango2 m1 = new Matango2('A');
        Matango2 m2 = new Matango2('B');

        // 3. それぞれ攻撃させる
        System.out.println("---勇者のターン---");
        h.attack(m1);
        h.run();

        System.out.println("\n---魔法使いのターン---");
        w.attack(m2);
        w.run();
    }
}
