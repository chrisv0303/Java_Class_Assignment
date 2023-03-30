package calc;

public class CalculatorTestDrive {

    public static void main(String[] args) {

        Calculator calc1 = new Calculator(25, 5);
        calc1.resultOfOperators();
        System.out.println("");//Prints empty space

        Calculator calc2 = new Calculator(18, 6);
        calc2.resultOfOperators();
    }
}
