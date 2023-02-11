
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
        Ogre greenOgre = new Ogre("Short","High");
        System.out.println(greenOgre);

       Ogre redOgre = new Ogre("Long","Low");
        System.out.println(redOgre);

       Zombie slowZombie = new Zombie("Slow", "Good");
        System.out.println(slowZombie);

        Zombie fastZombie = new Zombie("Fast", "Low");
        System.out.println(fastZombie);

        Dog spotDog = new Dog("High","Sharp");
        System.out.println(spotDog);

        GiantSpider bigSpider = new GiantSpider("Big","Red");
        System.out.println(bigSpider);

        Lizards poisonLizard = new Lizards(3,"yes");
        System.out.println(poisonLizard);

// Action objects

      MoveEast moveEast = new MoveEast();
      System.out.println(moveEast.Str());

      MoveWest moveWest = new MoveWest();
      System.out.println(moveWest.Str());

      MoveNorth moveNorth = new MoveNorth();
      System.out.println(moveNorth.Str());

      MoveSouth moveSouth = new MoveSouth();
      System.out.println(moveSouth.Str());

      Crouch crouch = new Crouch();
      System.out.println(crouch.Str());

      Flee flee = new Flee();
      System.out.println(flee.Str());

      ViewInventory viewInventory = new ViewInventory();
      System.out.println(viewInventory.Str());

    }
}