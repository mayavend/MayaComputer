package MayaNotebook;

public class Car1_Main {
    public static void main(String[] args) {
        Car1 c1 = new Car1();

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

        System.out.println("Name: " + c1.name);
        System.out.println("Manufacturer: " + c1.manufacturer);
        System.out.println("Engine: " + c1.engine);
        System.out.println("Color: "+  c1.color);
        System.out.println("Length: " + c1.length);
        System.out.println("Width: " + c1.width);
        System.out.println("Weight: " + c1.weight);
        System.out.println("Price: " + c1.price);
        System.out.println("Discount Percentage: " + c1.discountPercentage);
        System.out.println("Number of seats: " + c1.numberOfSeats);


        Car1 c2 = new Car1();

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

        System.out.println();
        System.out.println("Name: " + c2.name);
        System.out.println("Manufacturer: " + c2.manufacturer);
        System.out.println("Engine: " + c2.engine);
        System.out.println("Color: "+  c2.color);
        System.out.println("Length: " + c2.length);
        System.out.println("Width: " + c2.width);
        System.out.println("Weight: " + c2.weight);
        System.out.println("Price: " + c2.price);
        System.out.println("Discount Percentage: " + c2.discountPercentage);
        System.out.println("Number of seats: " + c2.numberOfSeats);

    }
}
