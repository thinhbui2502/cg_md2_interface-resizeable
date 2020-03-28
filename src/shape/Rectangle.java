package shape;

import resizeable.IResizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle {"
                + "width="
                + width
                + ", height="
                + height
                + '}'
                + " - Area: "
                + getArea();
    }

    @Override
    public double resize(double percent) {
        return getArea() * (1 + percent / 100);
    }
}
