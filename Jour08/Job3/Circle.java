package Jour08.Job3;

public class Circle extends Form{
    
    public Circle(String oneColor){
        super(oneColor);
    }

    public Circle(Circle anotherCircle){
        super(anotherCircle);
    }

    public void draw(){
        super.draw();
        System.out.println("Very round!");
    }
}