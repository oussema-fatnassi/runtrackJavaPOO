package Jour08.Job1;

public class ColoredRectangle extends Rectangle{

    String color;

    public ColoredRectangle(double width, double height, String color) {
        super(width, height);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "color = " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ColoredRectangle) {
            ColoredRectangle rect = (ColoredRectangle) obj;
            return (super.equals(obj) && color.equals(rect.color));
        }
        return false;
    }
}
