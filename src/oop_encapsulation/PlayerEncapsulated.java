package oop_encapsulation;

public class PlayerEncapsulated {

    private  String fullName;
    private int healthPercentage;
    private String weapon;

    public PlayerEncapsulated(String fullName) {
        this(fullName,100,"Sword");
    }

    public PlayerEncapsulated(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if (healthPercentage <= 0){
            this.healthPercentage = 1;
        } else if (healthPercentage >100) {
            this.healthPercentage = 100;
        }else {
            this.healthPercentage = healthPercentage;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <=0){
            System.out.println("player knocked out of game");

        }
    }
    public int healthRemaing(){
        return healthPercentage;
    }
    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage +extraHealth;
        if (healthPercentage > 100){
            System.out.println("player restored to 100%");
            healthPercentage =100;
        }
    }
}
