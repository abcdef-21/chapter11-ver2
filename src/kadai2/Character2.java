package kadai2;

public abstract class Character2 {
    String name;
    int hp;
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
    public abstract void attack(Matango2 m);
}
