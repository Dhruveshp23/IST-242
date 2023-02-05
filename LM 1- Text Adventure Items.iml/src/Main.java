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
        Ogre greenOgre = new Ogre("greenOgre",20,30,"Low","Short & Thin");
        System.out.println(greenOgre);

        Ogre redOgre = new Ogre("redOgre",30,30,"High","Long & Thick");
        System.out.println(redOgre);

        Zombie slowZombie = new Zombie("slowZombie", 20, 15,"Slow","Good");
        System.out.println(slowZombie);

        Zombie fastZombie = new Zombie("fastZombie", 20, 20,"Fast","Low");
        System.out.println(fastZombie);

        Dog spotDog = new Dog("spotDog", 20, 15,"High","Sharp");
        System.out.println(spotDog);

        GiantSpider bigSpider = new GiantSpider("bigSpider",10,5,"Big","Red");
        System.out.println(bigSpider);

        Lizards poisonLizard = new Lizards("poisonLizard",25,30,3,"yes");
        System.out.println(poisonLizard);


    }
}