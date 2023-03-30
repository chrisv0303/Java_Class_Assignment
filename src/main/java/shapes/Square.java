package shapes;

public class Square {

    public float side;
    public String color;

    public Square(float s){
        side = s;
    }

    public float calculateArea(){
        float areaOfASquare = side * side;
        return areaOfASquare;
    }

    public String square(){
        return "The color of this square is " + color + ". It's area is " + calculateArea() + ".";
    }
}
