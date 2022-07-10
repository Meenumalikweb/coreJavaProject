package inheritance;

public class MyCalculator1 implements Calculator{
    int a = 1;
    int b = 2;
    @Override
   public int add(){
        System.out.println(a+b);
        return (a+b);

    }

    @Override
    public int sub() {
        return b - 1;
    }
}
