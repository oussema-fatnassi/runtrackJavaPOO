package Jour07.Job3p2;

public class ColoredRectangle extends Rectangle{

    protected int color;

	public ColoredRectangle(int width, int height, int color) {
		super(width, height);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
	}
}
