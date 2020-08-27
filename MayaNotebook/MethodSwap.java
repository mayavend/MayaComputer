package MayaNotebook;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MethodSwap {
    public static void main(String[] args) {
        int[] list = {2,3};

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a");
//        int a = sc.nextInt();
//        System.out.println("Enter b");
//        int b = sc.nextInt();
       // Swap(list[0], list[1]);
        Swap2(list);
        System.out.println("a = " + list[0] + " and b = " + list[1]);
    }


  //  static void Swap(int a, int b){

//        int c =a;
//        a =b;
//        b= c;
//        System.out.println("a = " + a + " and b = " + b);
   // }
    static void Swap2(int [] f){
        int a;
        a = f[0];

        f[0] = f[1];
        f[1] = a;

        //System.out.println("a = " + a + " and b = " + b);
    }
}
