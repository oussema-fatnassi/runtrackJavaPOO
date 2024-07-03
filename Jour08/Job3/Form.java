package Jour08.Job3;

public class Form {
    private String color;

    public Form(String oneColor){
        color = oneColor;
    }

    public Form(Form other){
        this.color = other.color;
    }

    public void draw(){
        System.out.println("One form " + color);
    }
}