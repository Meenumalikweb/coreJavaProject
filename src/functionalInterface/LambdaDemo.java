package functionalInterface;

public class LambdaDemo {
    public static void main(String[] args) {
        Greetings greetings = n-> "Hello "+n;
        System.out.println(greetings.greet("Meenu")); //lambda

        Max max = (a,b)->a>b?a:b; //lambda-> if a greater than b print a else b
        System.out.println(max.max(4, 5));
    }
}

interface Greetings {
    String greet(String name); //abstract method
}

interface Max{
    int max (int num1, int num2); //abstract method
}

//Lambda will only work with functional Interface
//Functional interface has only one abstract method rest can be default and static with implementation.
//lamda is implemetation of a method in one line (Inline)