package Jour07.Job3p4;

public class Rectangle extends Figure{
    
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super(0, 0); 
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void show(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        super.show();
    }

}
