package MayaNotebook;

import java.util.Scanner;

public class ArrayParticularElement {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here:");
        int element = sc.nextInt();

        boolean bool = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                bool = true;
                break;
            }
            else {
                bool = false;
            }
        }
    if(bool == true) {
        System.out.println(element + " is in the array");
    }
    if(bool == false){
        System.out.println(element + " is not in the array");
    }
    }
}
