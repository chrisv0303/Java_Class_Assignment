package shapes;

public class ShapesTestDrive {

    public static void main(String[] args) {
        //Area of a triangle
        Triangle shapeT = new Triangle(8.6f, 9.2f);
        shapeT.color = "Yellow";
        System.out.println(shapeT.triangle() + shapeT.calculateArea() + ".");
        System.out.println("");//Prints empty space

        //Area of a square
        Square shapeS = new Square(7.5f);
        shapeS.color = "Green";
        System.out.println(shapeS.square() + shapeS.calculateArea() + ".");
        System.out.println("");//Prints empty space

        //Area of a circle
        Circle shapeC = new Circle(4.9f);
        shapeC.color = "Blue";
        System.out.println(shapeC.circle() + shapeC.calculateArea() + ".");
    }
}
