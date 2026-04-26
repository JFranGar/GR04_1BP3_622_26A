package ec.epn.edu.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("==Calcularo==");
        Calculator c = new Calculator();
        int sum = c.add(5, 3);
        System.out.println("El resultado de la suma es: " + sum);
        int difference = c.subtract(10, 4);
        System.out.println("El resultado de la difference es: " + difference);
        int product = c.multiply(6, 7);
        System.out.println("El resultado de la multiplicacion es: " + product);
        try {
            double quotient = c.divide(20, 4);
            System.out.println("El resultado de la division es: " + quotient);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
