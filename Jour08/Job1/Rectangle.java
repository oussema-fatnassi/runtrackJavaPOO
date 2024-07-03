package Jour08.Job1;

public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return  "Rectangle :\n" +
        "width = " + width + "\n" +
        "height = " + height + "\n";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return (width == rect.width && height == rect.height);
    }
}
