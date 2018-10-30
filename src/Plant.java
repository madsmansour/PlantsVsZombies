
public class Plant {
    int hp;
    int dmg;

    public Plant(int hpPlant, int dmgPlant) {
        this.hp = hpPlant;
        this.dmg = dmgPlant;
    }
    public Plant()
    {this.hp = 100;
        this.dmg = (int)(Math.random()*20+1);
    }

    public int plantAttack()
    { System.out.println("The Plant attacks the Zombie with: " + dmg + " Damage" );
        return dmg;}

    public int plantTakeDmg(int dmgTaken)
    { hp -= dmgTaken;
        System.out.println("The plant has " + hp + " HP left");
        return hp;
    }

}