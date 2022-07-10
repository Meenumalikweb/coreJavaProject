package practice;

public class Ifelse {
    public static void main(String[] args) {
        int n =101;
        if (n >= 1 && n <= 100) {
            System.out.println("It is a good number");
        }
        else{
            System.out.println("bad number");
        }

        //Positive/Negative
        int x=0;
        if(x > 0){
            System.out.println("positive");
        } else if (x < 0) {
            System.out.println("negative");
        } else{
            System.out.println("Zero");
        }

        //Even/Odd
        int y=50;
        if(y % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Largest Number
        int a=1; int b=9; int c=8;
        if(a>b && a>c){
            System.out.println("a is largest");
        } else if (b>a && b>c) {
            System.out.println("b is largest");
        }else {
            System.out.println("c is largest");
        }
    }

}
