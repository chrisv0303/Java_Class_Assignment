package calc;

public class CalculatorTestDrive {

    public static void main(String[] args) {

        Calculator calc1 = new Calculator(25, 5);
        System.out.println(calc1.add());
        System.out.println(calc1.subtract());
        System.out.println(calc1.multiply());
        System.out.println(calc1.divide());
        System.out.println("");

        Calculator calc2 = new Calculator(18, 6);
        System.out.println(calc2.add());
        System.out.println(calc2.subtract());
        System.out.println(calc2.multiply());
        System.out.println(calc2.divide());

    }
}
