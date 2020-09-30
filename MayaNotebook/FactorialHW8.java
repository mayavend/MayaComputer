package MayaNotebook;

import java.util.Scanner;

public class FactorialHW8 {
//    Write a program to find factorial of a given number using a method that contains a loop.
//    Make it so that we can pass any value. you can call the class as hw8

    public int Fact(int x){
        int prod =1;
        for (int i = 1; i <= x; i++) {
            prod = i*prod;
        }
        return prod;
    }

    public static void main(String[] args) {
        FactorialHW8 f1= new FactorialHW8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int a = sc.nextInt();
        System.out.println(f1.Fact(a));
    }
}
