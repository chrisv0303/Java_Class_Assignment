package shapes;

public class ShapesTestDrive {

    public static void main(String[] args) {
        //Area of a triangle
        Triangle shapeT = new Triangle();
        System.out.println(shapeT.triangle() + shapeT.calculateArea(8.6f,9.2f));
        System.out.println("");

        //Area of a square
        Square shapeS = new Square();
        System.out.println(shapeS.square() + shapeS.calculateArea(7.5f));
        System.out.println("");

        //Area of a circle
        Circle shapeC = new Circle();
        System.out.println(shapeC.circle() + shapeC.calculateArea(4.9f));
    }
}
