package MayaNotebook;

import java.util.Scanner;

public class MultiplyMain {
    public static void main(String[] args) {
        MutliplyHW18 m1 = new MutliplyHW18();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product is: " + m1.Mult(a,b));
    }
}
