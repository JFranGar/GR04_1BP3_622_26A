package ec.epn.edu.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("==Es un calculator execute==");
        Calculator c = new Calculator();
        int addition = c.addition(5, 5);
        System.out.println("Addition: " + addition);
    }
}
