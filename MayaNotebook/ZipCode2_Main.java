package MayaNotebook;

import java.util.Scanner;

public class ZipCode2_Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a five-digit zip code: ");
        String five = sc.next();
        System.out.println("Enter a four-digit addition: ");
        String four = sc.next();
        ZipCode2 z1 = new ZipCode2();
        ZipCode2 z2 = new ZipCode2(five);
        ZipCode2 z3 = new ZipCode2(five,four);

        z3.setFiveDigit("53467");
        z3.setPlus4("3021");
        System.out.println(z1);
        z1.Display();
        z2.Display();
        z3.Display();
    }
}
