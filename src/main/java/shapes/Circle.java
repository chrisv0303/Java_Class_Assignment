package shapes;

public class Circle {
    public float radius;
    public String color;

    public Circle(float r){
        radius = r;
    }

    public float calculateArea(){
        float areaOfACircle = (float)Math.PI * (radius * radius);
        return areaOfACircle;
    }

    public String circle(){
        return "The area of a circle is ";
    }
}
