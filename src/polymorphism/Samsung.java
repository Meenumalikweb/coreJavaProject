package polymorphism;

public class Samsung extends MobileBase {
    public Samsung() {
        System.out.println("Constructing Samsung");
    }

    public Samsung(String name, int rate){
        super(name,rate);
        System.out.println("Constructing samsung with parameters");
    }

    @Override
    public void calPrice() {
        System.out.println("setprice for samsung");
        setPrice(getPrice()+500);
    }
}

