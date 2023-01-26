public class Main {
    public static void main(String[] args) {
        Item goldBar = new Gold(10);
        Item magicSword = new Sword();
        Item softPillow = new Pillow();
        Item bigMace = new Mace();

        System.out.println(goldBar);
        System.out.println(magicSword);
        System.out.println(softPillow);
        System.out.println(bigMace);
    }
}
