package inheritance;
//CHILD 1st
public class Car extends Vehicle{
    private String owner;

    public String getOwner() {return owner;}

    public void setOwner(String owner) {this.owner = owner;}

    public Car(String model, String make, int millage, String owner) {
        super(model, make, millage);
        this.owner = owner;
        System.out.println("Check Ownership");
    }
}
