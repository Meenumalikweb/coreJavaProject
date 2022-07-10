package practice;

public class Loop {
    public static void main(String[] args) {
        //Print Even Number
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int mul = 1; //multiple value is always 1
        for (int i = 1; i <= 10; i++) {
            mul = i * mul;
        }
        System.out.println(mul);

        //Factorial number  5*4*3*4*2*1 = answer
        int fact = 1;
         for(int i = 5; i>=1; i--){
             fact = i * fact;
         }
        System.out.println(fact);

        //Practice
        //Fibonacci Series 1 1 2 3 5 8
        int fib = 1;
        for(int i = 0; i<=10; i++){

// 1
        }
        System.out.println(fib);

        //double for loop
       for(int i = 1; i<=5; i++){
           for(int j = 1; j<=5; j++){
                System.out.print(i+" "); //print in the same line
            }
            System.out.println(); //ln means printing in next line
       }


        //while

    }
}

//practice while loop for sum of natural numbers and factorial problem...
//Create the number guessing game .Add extension to it for giving hints for lesser or greater..
//Create switch block for printing number of days in each month.