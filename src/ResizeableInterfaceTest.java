import shape.Shape;
import shape.Square;
import shape.Circle;
import shape.Rectangle;
import resizeable.IResizeable;

public class ResizeableInterfaceTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 8);
        shapes[2] = new Square(10);

        for (Shape shape : shapes) {
            System.out.println("Original size: ");
            System.out.println(shape);

            System.out.println("After resizing: ");
            if (shape instanceof Circle) {
                IResizeable iResizeable1 = (Circle) shape;
                System.out.println("Area = " + iResizeable1.resize(50));
            }

            if (shape instanceof Rectangle) {
                IResizeable iResizeable2 = (Rectangle) shape;
                System.out.println("Area = " + iResizeable2.resize(100));
            }

            if (shape instanceof Square) {
                IResizeable iResizeable3 = (Square) shape;
                System.out.println(iResizeable3.resize(75));
            }
        }


    }
}
