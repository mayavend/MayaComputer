package MayaNotebook;

import java.util.Scanner;

public class PasswordClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        IsLetterNumber p1 = new IsLetterNumber();


        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);
            if (p1.Letter(ch)==false && p1.Number(ch) == false) {
                System.out.println("Invalid :(");
            }
            else{
                System.out.println("Valid");
            }
        }
    }
}
