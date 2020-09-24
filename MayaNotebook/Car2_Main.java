package MayaNotebook;

public class Car2_Main {
    public static void main(String[] args) {
        Car2 c1 = new Car2();

        c1.name = "Pilot";
        c1.manufacturer = "Honda";
        c1.engine="V6";
        c1.color="black";
        c1.length=16;
        c1.width=7;
        c1.weight=5000;
        c1.price=40000.0;
        c1.discountPercentage=5.5;
        c1.numberOfSeats=7;
        c1.Display();

        Car2 c2 = new Car2();

        c2.name = "Camry";
        c2.manufacturer = "Toyota";
        c2.engine="V6";
        c2.color="red";
        c2.length=10;
        c2.width=4;
        c2.weight=4000;
        c2.price=25000.0;
        c2.discountPercentage=7.5;
        c2.numberOfSeats=5;

        c2.Display();


    }
}
