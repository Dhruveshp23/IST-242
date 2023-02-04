public class Main {
    public static void main(String[] args) {

//Item objects
        Item goldBar = new Gold(10);
        System.out.println(goldBar);

        Item magicSword = new Sword();
        System.out.println(magicSword);

        Item softPillow = new Pillow();
        System.out.println(softPillow);

        Item bigMace = new Mace();
        System.out.println(bigMace);

// Enemy objects
        Enemy greenOgre = new Ogre("greenOgre",30,20);
        System.out.println(greenOgre);

        Enemy redOgre = new Ogre("redOgre",35,25);
        System.out.println(redOgre);

        Enemy slowZombie = new Zombie("slowZombie", 20, 15);
        System.out.println(slowZombie);

        Enemy fastZombie = new Zombie("fastZombie", 25, 20);
        System.out.println(fastZombie);

        Enemy spotDog = new Dog("spotDog", 20, 15);
        System.out.println(spotDog);

        Enemy bigSpider = new GiantSpider("bigSpider",10,5);
        System.out.println(bigSpider);

        Enemy poisonLizard = new Lizards("poisonLizard",25,30);
        System.out.println(poisonLizard);


    }
}