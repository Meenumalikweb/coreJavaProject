package practice;

public class Calculator {
    public static void main(String[] args) {
        addition(2,3);

        float sub = subtract(5,9);
        System.out.println("subtraction is " +sub);

        int mul = multiply(6, 8);
        System.out.println("Multiplication is " +mul);

        double div = division(9,3);
        System.out.println("Division is " + div);
    }
    public static int addition(int x, int y) {
        int sum = x+y;
        System.out.println("addition is " + sum);
        return sum;
    }
    public static float subtract(float a, float b) {
        float sub = a-b;
        return sub;
    }
    public static int multiply(int c, int d) {
        int mul = c*d;
        return mul;
    }
    public static double division(double x, double y) {
        double div = x/y;
        return div;
    }
}


