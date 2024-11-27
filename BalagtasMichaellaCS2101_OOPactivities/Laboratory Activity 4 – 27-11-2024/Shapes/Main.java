package Shapes;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(12);
        Rectangle rectangle = new Rectangle(20, 15);
        Triangle triangle = new Triangle(8, 10, 13);

        //collection of shapes
        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        //for computing and printing the perimeter and area
        shapeCollection.getPropertyValues();

    }
}
