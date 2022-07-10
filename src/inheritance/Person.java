package inheritance;
//PARENT CLASS
public class Person {
    private String firstName;
    private String lastName;
    private int sinNum;

    public void setFirstName( String fName ) {
        this.firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lName){
        this.lastName = lName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSinNum(int sin){
        this.sinNum = sin;
    }
    public int getSinNum(){
        return sinNum;
    }

    public Person(String firstName, String lastName, int sinNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sinNum = sinNum;
    }
    public void disp(){
        System.out.println("Display Members");
    }
}










 //   private String name;
//    private int age;
//    private String address;
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }