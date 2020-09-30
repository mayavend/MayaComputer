package MayaNotebook;

public class MutliplyHW18 {
//    Write a class Multiply . The class should a private instance variable mul which is intialized to 0
//    when object is created. Write a method that takes two parameters and multiplies them and set it to
//    the mul variable .Note that the numbers should be positive .
//    Write another class with main method. Create an object of Multiply class,
//    perform the operation. Then print the result

    private int mul =0;

    int Mult(int x, int y){
        mul = x*y;
        return mul;
    }
}
