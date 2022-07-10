package polymorphism;

public class MobileBase {
    private String modelName;
    private int price;

    public MobileBase(){
        System.out.println("Constructing MobileBase");
    }
    public MobileBase(String name, int rate){
        System.out.println("Constructing MobileBase with parameters");
        modelName = name;
        price = rate;
    }
    public void setModelName(String name){
        this.modelName = name;
    }
    public void setPrice(int rate){
        this.price = rate;
    }
    public void calPrice(){
        price = price + 5;
    }
    public int getPrice(){
        return price;
    }
    public String getModelName(){
        return modelName;
    }
}

