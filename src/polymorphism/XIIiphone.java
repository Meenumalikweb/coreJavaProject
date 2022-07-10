package polymorphism;

public class XIIiphone extends XIiphone {
    public XIIiphone(){
        System.out.println("Constructing XIIiphone");
    }
    public XIIiphone(String name, int rate){
        super(name,rate);
        System.out.println("COnstrcting XIIiphone with parameters");
    }
    @Override
    public void calPrice() {
        System.out.println("Set price for XII ipnone");
        setPrice(getPrice() +400);
    }
}
