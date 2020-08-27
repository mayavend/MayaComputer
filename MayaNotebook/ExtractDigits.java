package MayaNotebook;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here");
        int divInt = sc.nextInt();

        while (divInt>0) {
            int units = divInt % 10;
            double div = divInt / 10.0;
            divInt = (int) div;
            System.out.print(units + " ");
        }
    }
}
