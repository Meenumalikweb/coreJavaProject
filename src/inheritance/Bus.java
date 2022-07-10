package inheritance;
//CHILD 2nd
public class Bus extends Vehicle{
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {this.route = route;}

    public Bus(String model, String make, int millage, String route) {
        super(model, make, millage);
        this.route = route;
        System.out.println("Bus Routes");
    }
}
