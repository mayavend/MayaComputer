package MayaNotebook;

public class Product1 {
//    Shopping class: Can be Extended using array of Objects.
//    Create a Product1 class product_name, price and discount_rate(5 to 15%) as instance variables.
//    Create constructor, Create a display method that displays the details of the Product.
//    It sould print price before applying discount and price after after applying the discount.
//    Create apply_discount method which will apply the discount on the price based on the discount_rate
//    variable and return the discounted price.
//    Create a Shopping_Cart1 class which will contain the main method. In the main method, create two
//    product objects, display the product details. Find the total price after adding discounted prices
//    for both products and display them.

    String product_name;
    int price;
    double discountRate;

    public Product1(String n, int p, double d) {
        product_name=n;
        price=p;
        discountRate=d;
    }
    
}
