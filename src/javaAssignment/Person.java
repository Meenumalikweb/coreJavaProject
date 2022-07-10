package javaAssignment;
//ASSIGNMENT-1
public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public Person(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public String getFullName() {
        return getFirstName() +" "+ getLastName();
    }

    public String changeAddress(String add){
        this.address = add;
        return add;
    }

    public String getAddress() {
        return address;
    }
}

