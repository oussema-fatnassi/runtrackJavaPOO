package Jour08.Job3;

public class Triangle extends Form{
    public Triangle(String oneColor){
        super(oneColor);
    }

    public Triangle(Triangle anotherTriangle){
        super(anotherTriangle);
    }

    public void draw(){
        super.draw();
        System.out.println("Very sharp angles!");
    }
}