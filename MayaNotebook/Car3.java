package MayaNotebook;

public class Car3 {
//    Create Car3 class and Car3_Main class. Copy the contents of Car2 to Car3 and Car2_Main to Car3_Main.
//    Create a constructor in the Car3 class and change the Car3_Main to make use of constructor
//    you just created . Accept data from the user using buffered reader.
//    (if you do not know about buffered reader you can give normal values using constructors)
    String name;
    String manufacturer;
    String engine;
    String color;
    int length;
    int width;
    int weight;
    double price;
    double discountPercentage;
    int numberOfSeats;

    public void Display(){
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Engine: " + engine);
        System.out.println("Color: "+  color);
        System.out.println("Length: " +length);
        System.out.println("Width: " + width);
        System.out.println("Weight: " +weight);
        System.out.println("Price: " + price);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println();
    }

    public Car3(String name, String manufacturer, String engine, String color, int length, int width, int weight,
            double price, double discountPercentage, int numberOfSeats){
        this.name=name;
        this.manufacturer=manufacturer;
        this.engine=engine;
        this.color=color;
        this.length=length;
        this.width=width;
        this.weight=weight;
        this.price=price;
        this.discountPercentage=discountPercentage;
        this.numberOfSeats=numberOfSeats;
    }

//    public Car3(){
////        name = "Pilot";
////        manufacturer = "Honda";
////        engine="V6";
////        color="black";
////        length=16;
////        width=7;
////        weight=5000;
////        price=40000.0;
////        discountPercentage=5.5;
////        numberOfSeats=7;
//    }

    public Car3(){
        name = "Camry";
        manufacturer = "Toyota";
        engine="V6";
        color="red";
        length=10;
        width=4;
        weight=4000;
        price=25000.0;
        discountPercentage=7.5;
        numberOfSeats=5;
    }
}
