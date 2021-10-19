package oop.encapsulation.exampleEncapsulation;

public class EncapsulationPlayer {
    private String fullName;
    private int health;
    private String weapon;

    public EncapsulationPlayer(String name, int health, String weapon) {
        this.fullName = name;
//      With Encapsulation, we can add validation
        if(health > 0 && health <= 100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("You die!");
        }
    }

    public int getHealth(){
        return this.health;
    }
}
