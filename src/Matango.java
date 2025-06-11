public class Matango {
    int hp;
    final int level = 10;
    char suffix;
    public void run(){
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
    public void slip(){
        this.hp -= 5;
        System.out.println("お化けキノコ" + this.suffix + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
}
