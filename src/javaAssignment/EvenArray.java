package javaAssignment;
//Assignment-5
public class EvenArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 1, 4, 7};
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println("Even number:" + arr[i]);
                    count++;
                }
            }
        System.out.println("Count is: "+count);
    }
}