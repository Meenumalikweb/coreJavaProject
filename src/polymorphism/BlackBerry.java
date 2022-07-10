package polymorphism;

public class BlackBerry extends MobileBase {
    public BlackBerry(){
        System.out.println("Constructing Blackberry");
    }
    public BlackBerry(String name, int rate){
        super(name, rate);
        System.out.println("Constructing Blackberry with parameters");
    }

    @Override
    public void calPrice() {
        System.out.println("set price of blackberry");
        setPrice(getPrice() +500);
    }
}
