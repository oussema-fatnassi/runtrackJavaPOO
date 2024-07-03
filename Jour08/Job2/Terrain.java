package Jour08.Job2;

public class Terrain extends Magic{

    String color;

    public Terrain(String color){
        super(0);
        this.color = color;
    }

    public void Show(){
        System.out.println("TERRAIN:");
        System.out.println("Cost: " + this.cost);
        System.out.println("Color: " + this.color);
    }
}
