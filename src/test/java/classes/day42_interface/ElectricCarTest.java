package classes.day42_interface;

public class ElectricCarTest {

    public static void main(String[] args) {

        Tesla modelS = new Tesla("Model S", 45000, "Navy Blue");
        modelS.start();
        modelS.drive();
        modelS.charge();
        modelS.drive();
        modelS.stop();

        System.out.println("******************************");

        Ford fusion = new Ford("Fusion", 35000, "Black", 2021);
        fusion.start();
        fusion.drive();
        fusion.charge();
        fusion.drive();
        fusion.stop();

        System.out.println("******************************");

        TeslaSemi semi = new TeslaSemi("Semi", 50000, "Silver", 3.5);
        semi.start();
        semi.drive();
        semi.charge();
        semi.drive();
        semi.load("Computers");
        semi.drive();
        semi.stop();

        System.out.println("******************************");

        TeslaTruck tr = new TeslaTruck("CyberTruck", 100000, "White", 6.0);
        tr.start();
        tr.drive();
        tr.load("New furniture");
        tr.charge();
        tr.stop();

        System.out.println("******************************");

        System.out.println(modelS.toString());
        System.out.println(fusion.toString());
        System.out.println(semi.toString());
        System.out.println(tr.toString());

    }
}
