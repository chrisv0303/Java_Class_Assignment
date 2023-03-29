package shapes;

public class Circle {

    public float radius;

    public float calculateArea(float r){
        radius = r;
        float areaOfACircle = (float)Math.PI * (r * r);
        return areaOfACircle;
    }

    public String circle(){
        return "The area of a circle is ";
    }
}
