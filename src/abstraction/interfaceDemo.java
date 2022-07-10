package abstraction;

public class interfaceDemo {
    public static void main(String[] args) {
        //Anonymous Class
        Work w = new Work() {
            public void work() {
                System.out.println("working");
            }
        };
        w.work();
    }
}
interface Work{
    void work();
}
interface IPlay{
    void play();
}
interface Study{
    void study();
}
//class Employee implements Work, IPlay{
//    @Override
//    public void work() {
//        System.out.println("working");
//    }
//
//    @Override
//    public void play(){
//        System.out.println("playing");
//    }
//}










//Interfaces can have class inside also can have sub interfaces and inner interfaces (method.inner)
