package shapes;

public class Square {

    public float side;

    public float calculateArea(float s){
        side = s;
        float areaOfASquare = s * s;
        return areaOfASquare;
    }

    public String square(){
        return "The area of a square is ";
    }
}
