package Jour08.Job2;

public class Spell extends Magic{

    String name;
    String explanation;

    public Spell(int cost, String name, String explanation){
        super(cost);
        this.name = name;
        this.explanation = explanation;
    }

    public void Show(){
        System.out.println("SPELL: ");
        System.out.println("Cost: " + this.cost);
        System.out.println("Name: " + this.name);
        System.out.println("Explanation: " + this.explanation);
    }
}
