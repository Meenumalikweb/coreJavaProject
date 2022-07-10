package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        MobileBase a,b,c,d,e,f;
        a = new MobileBase("simple Mobile", 500);
        b = new Iphone("Iphone", 500);
        c = new Samsung("Samsung", 500);
        d = new BlackBerry("Blackberry", 500);
        e = new XIiphone("XI Iphone", 500);
        f = new XIIiphone("XII Iphone", 500);


        a.calPrice();
        b.calPrice();
        c.calPrice();
        d.calPrice();
        e.calPrice();
        f.calPrice();

        System.out.println("Price of Mobilebase" + a.getPrice());
        System.out.println("Price of Iphine" +b.getPrice());
        System.out.println("Price of Samsung" + c.getPrice());
        System.out.println("Price of Blackberry" + d.getPrice());
        System.out.println("Price for XI iphone" + e.getPrice());
        System.out.println("Price for XII iphine" + f.getPrice());
    }
}

