package packageA.packageB;

public class EnumDemo {
    public static void main(String[] args) {
        ShirtFactory fact = new ShirtFactory();
       // System.out.println("red", "M");
    }
}
enum Size{
    S("small"),M("Medium"),L("large");
    Size(String s){

    }
}
class ShirtFactory {
    public Shirt getShirt(String color, Size size){
        return new Shirt(color, size);
    }
}
class Shirt {
    private String color;
    private Size size;

    Shirt(String color, Size size) {
    }
}
