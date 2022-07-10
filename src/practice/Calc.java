package practice;

public class Calc {
    private int x;
    private int y;
    //Constructor Overloading
    public Calc(){
        //if not chained it we go to super (object class) which is super();
        //super call should be once only
        System.out.println("default");
    }
    public Calc(int x) {
        this(); //chaining to default
        this.x = x;
    }
    public Calc(int x, int y){
        this(2); //calling existing constructor //chaining of constructor allowed only once and has to be first line
        this.y = y;
    }
}
