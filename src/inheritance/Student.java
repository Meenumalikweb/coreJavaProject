package inheritance;
//CHILD CLASS
public class Student extends Person{ //inheriting properties of class person to student
    private int studentNum;
    private double marks;

    public void setStudentNum( int num ) {
        this.studentNum = num;
    }
    public int getStudentNum(){
        return studentNum;
    }
    public void setMarks(double sMarks){
        this.marks = sMarks;
    }
    public double getMarks() {
        return marks;
    }

    //Default Constructor
    public Student(String firstName, String lastName, int sinNum) {
        super(firstName, lastName, sinNum);
    }
    public Student(String firstName, String lastName, int sinNum, int studentNum, double marks) {
        super(firstName, lastName, sinNum);
        this.studentNum = studentNum;
        this.marks = marks;
    }
}


























//    private int grade;
//
//    public Student(String name, int age, String address, int grade) {
//        super(name, age, address);
//        this.grade = grade;
//    }