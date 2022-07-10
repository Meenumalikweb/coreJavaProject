package practice;

public class Circle {
    private String color;
    private double circumfrence;
    private double radius;
    private double pi = 3.14;

    public double getArea(){
        radius = 2;
        radius = pi * radius * radius;
        return radius;
    }
    public double getArea1(double radius){
        radius = pi * radius * radius;
        System.out.println("Radius is:" +radius);
        return radius;
    }

    public double getCircumfrence(double circumfrence) {
        circumfrence = 2 * pi * radius;
        return circumfrence;
    }
}
