package MayaNotebook;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password here:");
        String password = sc.next();
        int l = password.length();


        if (l<8) {
            System.out.println("Your password must have at least 8 characters.");
        }

        int i;
        boolean valid;

        for (i=0; i<password.length(); i++){
            char passChar = password.charAt(l-1);
            if ((passChar>= 'a' && passChar <= 'z') || (passChar>= 'A' && passChar<= 'Z') || (passChar>='0' && passChar <='9')){
                valid = true;

            }
            else {
                System.out.println("Try again");
            }
        }
        System.out.println("Good password");
    }
}
