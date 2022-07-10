package javaAssignment;

public class BMI {
    private double height, weight;

    public void calBMI(double height, double weight){
        double bmi = weight / (height*height);
        System.out.println("BMI is: "+bmi);
    }
}
