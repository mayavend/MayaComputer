package MayaNotebook;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        int l = name.length();
        boolean i =true;
        int n=0;
        while (n<l/2) {
            if (name.charAt(n) != name.charAt(l - n-1)) {
                i = false;
                System.out.println("Not a palindrome");
                break;

            }
            n++;
        }
//        if (i = false){
//            System.out.println("Not a palindrome");
//        }
        if (i != false){
            System.out.println("Palindrome");
        }


    }

    }

