package shapes;

public class Triangle {

    public float base;
    public float height;


    public float calculateArea(float b, float h){
        base = b;
        height = h;
        float areaOfATriangle = (b * h) * 0.5f;
        return areaOfATriangle;
    }

    public String triangle(){
        return "The area of a triangle is ";
    }
}
