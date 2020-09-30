package MayaNotebook;

import java.util.Scanner;

public class CoffeeMaker {
//    Create a class that models a coffee maker. No Instance variables needed.
//    Add a method that brews strong coffee. It will actually just output a string that says it is
//    "brewing strong coffee, but can’t you just smell it?"
//    Add a method that brews weak coffee. output a string "You cannot smell it but i am brewing weak coffee"
//    Create a class that will create a coffee maker and will brew some coffee.
//    Have it brew both strong and weak coffee. This class will have a main method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a percentage of coffee:");
        int percentage = sc.nextInt();

        CoffeeMaker c1 = new CoffeeMaker();
        if(percentage>40){
            c1.Strong();
        }
        else {
            c1.Weak();
        }
    }

    public void Strong(){
        System.out.println("brewing strong coffee, but can’t you just smell it?");
    }

    public void Weak(){
        System.out.println("You cannot smell it but i am brewing weak coffee");
    }
}
