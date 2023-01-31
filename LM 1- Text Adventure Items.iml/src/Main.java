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
        Enemy greenOgre = new Ogre();
        System.out.println(greenOgre);

        Enemy redOgre = new Ogre();
        System.out.println(redOgre);

        Enemy slowZombie = new Zombie();
        System.out.println(slowZombie);

        Enemy fastZombie = new Zombie();
        System.out.println(fastZombie);

        Enemy spotDog = new Dog();
        System.out.println(spotDog);

        Enemy bigSpider = new GiantSpider();
        System.out.println(bigSpider);

        Enemy poisonLizard = new Lizards();
        System.out.println(poisonLizard);


    }
}
