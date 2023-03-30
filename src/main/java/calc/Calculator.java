package calc;

public class Calculator {

    public int firstNum;
    public int secondNum;

    public Calculator(int firstValue, int secondValue){
        firstNum = firstValue;
        secondNum = secondValue;
    }


    public int add(){
        int result = firstNum + secondNum;
        return result;
    }

    public int subtract(){
        int result = firstNum - secondNum;
        return result;
    }

    public int multiply(){
        int result = firstNum * secondNum;
        return result;
    }

    public int divide(){
        int result = firstNum / secondNum;
        return result;
    }

    public void resultOfOperators(){
        System.out.println("Addition value: " + add());
        System.out.println("Subtraction value: " + subtract());
        System.out.println("Multiplication value: " + multiply());
        System.out.println("Division value: " + divide());
    }
}
