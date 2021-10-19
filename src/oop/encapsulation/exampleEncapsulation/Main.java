package oop.encapsulation.exampleEncapsulation;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();

//      Use public on field, so we can access directly to set this variable without setter
        p1.name = "tim";
        p1.health = 20;
        p1.weapon = "Bow";

        int damage = 10;
        p1.loseHealth(damage);
        System.out.println("Remaining health P1= " + p1.healthRemaining());

        damage = 11;
        p1.health = 200; // We don't want player can change health, because it cheats
        p1.loseHealth(damage);
        System.out.println("Remaining health P1= " + p1.healthRemaining());

//      Calling object with Encapsulation
        EncapsulationPlayer p2 = new EncapsulationPlayer("Tim",-8,"Gun");
        System.out.println("Initial health P2= " + p2.getHealth());
        p2.loseHealth(50);
        System.out.println("Remaining health P2= " + p2.getHealth());

    }
}
