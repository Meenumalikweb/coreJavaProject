package practice;

public class Overridding {
    //signature of methods can stay same but parameters should be different such as data type and number of parameters
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void sum(double a, int b, int c) {
        System.out.println(a + b + c);
    }
}