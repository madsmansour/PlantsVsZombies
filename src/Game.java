public class Game {

    public static void start() {
        Plant plant1 = new PeaShootingPlant();
        Zombie zombie1 = new CrazyZombie();
        while (zombie1.hp > 0 && plant1.hp > 0) {
            zombie1.zombieAttack();
            plant1.plantTakeDmg(zombie1.changeDmg());
            if (plant1.hp == 0)
            {break;}
            zombie1.changeDmg();
            plant1.plantAttack();
            zombie1.zombieTakeDmg(plant1.dmg);
            if (zombie1.hp == 0)
            {break;}
        }
        if (plant1.hp < 0)
        {
            System.out.println("ZOMBIE WINS");}
        if (zombie1.hp < 0)
        {
            System.out.println("PLANT WINS");
        }


    }
}