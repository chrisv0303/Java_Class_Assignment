package shapes;

public class Triangle {

    public float base;
    public float height;
    public String color;

    public Triangle(float b, float h){
        base = b;
        height = h;
    }


    public float calculateArea(){
        float areaOfATriangle = (base * height) * 0.5f;
        return areaOfATriangle;
    }

    public String triangle(){
        return "The color of this triangle is " + color + ". It's area is " + calculateArea() + ".";
    }
}
