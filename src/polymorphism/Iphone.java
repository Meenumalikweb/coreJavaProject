package polymorphism;

public class Iphone extends MobileBase {
    public Iphone() {
        System.out.println("Constructing Iphone");
    }

    public Iphone(String name, int rate) {
        super(name,rate);
        System.out.println("construcitng Iphone with parameters ");
    }

    @Override
    public void calPrice() {
        System.out.println("set price of Iphone");
        setPrice(getPrice() +200);
    }
}
