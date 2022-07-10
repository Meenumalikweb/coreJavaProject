package inheritance;
//PARENT CLASS
public class Vehicle {
    private String model;
    private String make;
    private int millage;

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getMake() {return make;}

    public void setMake(String make) {this.make = make;}

    public int getMillage() {return millage;}

    public void setMillage(int millage) {this.millage = millage;}

    public Vehicle(String model, int millage) {
        this.model = model;
        this.millage = millage;
    }

    public Vehicle(String model, String make, int millage) {
        this.model = model;
        this.make = make;
        this.millage = millage;
        System.out.println("Vehicle's information");

    }
}
