package Jour07.Job3p4;

public class ColoredRectangle extends Rectangle{

    protected int color;

	public ColoredRectangle(int width, int height, int color) {
		super(width, height);
        this.color = color;
    }

    public void show(){
        System.out.println("Color: " + color);
    }
}
