package Jour08.Job2;

public class Creature extends Magic{

    String name;
    int damagePoints;
    int lifePoints;

    public Creature(int cost, String name, int damagePoints, int lifePoints){
        super(cost);
        this.name = name;
        this.damagePoints = damagePoints;
        this.lifePoints = lifePoints;
    }

    public void Show(){
        System.out.println("CREATURE: ");
        System.out.println("Cost: " + this.cost);
        System.out.println("Name: " + this.name);
        System.out.println("Damage Points: " + this.damagePoints);
        System.out.println("Life Points: " + this.lifePoints);
    }
    
}
