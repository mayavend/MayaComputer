package MayaNotebook;

public class Car2 {
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
}
