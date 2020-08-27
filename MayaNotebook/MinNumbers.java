package MayaNotebook;

import java.util.Scanner;

public class MinNumbers {
    public static void main(String[] args) {
        int number;
        int min;
        int max;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        number = sc.nextInt();

        min = max = number;
        while(true){
            System.out.println("Enter another number here: ");
            number = sc.nextInt();


            if (number ==0){
                break;
            }
            if (number<min){
                min = number;
//                max = secondVal;
            }
          
            if (number>max){
                //min = secondVal;
                max = number;
            }


        }
        System.out.println("The min is " + min + " and the max is  "+ max);
    }
}
