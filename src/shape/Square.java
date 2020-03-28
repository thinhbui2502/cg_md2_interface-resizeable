package shape;

import resizeable.IResizeable;

public class Square extends Rectangle implements IResizeable {

    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color) {
        super(side,side,color);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide (double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    public double getArea () {
        return Math.pow(getSide(),2);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "Square {"
                + "side="
                + getWidth()
                + '}'
                + " - Area: "
                + getArea();
    }
}
