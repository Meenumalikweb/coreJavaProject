package practice;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in); //scanner objects
        int total = 0; //creating empty bucket to store total at the end
        for (int i = 0; i < 5; i++) {
            System.out.println("Please Enter No.");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            total = total + arr[i]; //total of all array elements
        }
        System.out.println("Total is: "+total);


        //2D Array
        int[][] arr2 = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = 10; //data capturing
      }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]+" "); //data printing
            }
            System.out.println();//printing in new line
        }

//        int total;
//        for(int i = 0; i<4; i++){
//            total = 0;
//            for(int j = 0; j<3; j++){
//               total = total + arr2 [i][j];
//
//            }
//            System.out.print("**" + total);
//        }
//        System.out.println();
   }
}


// arr = null; free array fot garbage collector once its purpose is fulfilled
//arr = new int [3]; hook old array to new (one save up memory)



