package polymorphism;

public class XIiphone extends Iphone {
    public XIiphone(){
        System.out.println("Constructing XIiphone");
    }
    public XIiphone(String name, int rate){
        super(name,rate);
        System.out.println("COnstrcting XIiphone with parameters");
    }
    @Override
    public void calPrice() {
        System.out.println("Set price for XI iphone");
        setPrice(getPrice() + 300);
    }
}
