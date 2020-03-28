package shape;

import resizeable.IResizeable;

public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle {"
                + "radius="
                + radius
                + '}'
                + " - Area: "
                + getArea();
    }

    @Override
    public double resize(double percent) {
        return getArea() * (1 + percent / 100);
    }
}
