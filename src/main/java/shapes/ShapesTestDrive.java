package shapes;

public class ShapesTestDrive {

    public static void main(String[] args) {
        //Area of a triangle
        Triangle T1 = new Triangle(8.6f, 9.2f);
        Triangle T2 = new Triangle(7.1f, 11.5f);
        T1.color = "Yellow";
        T2.color = "Red";
        System.out.println(T1.triangle());
        System.out.println(T2.triangle());
        System.out.println("");//Prints empty space

        //Area of a square
        Square S1 = new Square(7.5f);
        Square S2 = new Square(10.0f);
        S1.color = "Green";
        S2.color = "Blue";
        System.out.println(S1.square());
        System.out.println(S2.square());
        System.out.println("");//Prints empty space

        //Area of a circle
        Circle C1 = new Circle(4.9f);
        Circle C2 = new Circle(6.4f);
        C1.color = "Orange";
        C2.color = "Purple";
        System.out.println(C1.circle());
        System.out.println(C2.circle());
    }
}
